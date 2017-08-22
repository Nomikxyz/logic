package org.logic

import org.logic.ast.RootNode


class LogicGenerator extends ClassLoader {

  def generate(logicCode: String, filename: String): (Array[Byte], RootNode) = {
    val parser = new LogicParser
    val rootNode = parser.parse(logicCode)
    (rootNode.generateByteCode(filename), rootNode)
  }
}
