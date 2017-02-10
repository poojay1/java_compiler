import lexRule
import parser
import ply.lex as lex
import ply.yacc as yacc
import node_file

lexer = lex.lex(module=lexRule)
parse = yacc.yacc(module=parser.ExpressionParser())

parse.parse("=",lexer=lexer)
node_file.graph_plot()