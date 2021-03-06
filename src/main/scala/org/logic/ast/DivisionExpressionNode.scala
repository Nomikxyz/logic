package org.logic.ast

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes._
import org.logic.SymbolTable

case class DivisionExpressionNode(expression: AstNode ,operand: AstNode ) extends AstNode{
  def generate(mv: MethodVisitor, symbolTable: SymbolTable) {
    expression.generate(mv, symbolTable)
    operand.generate(mv, symbolTable)
    mv.visitInsn(IDIV)
  }
}
