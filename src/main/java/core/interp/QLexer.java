// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, Println = 16,
            Component = 17, Render = 18, AddComponent = 19, New = 20, Window = 21, Var = 22, AddWSText = 23,
            Import = 24, Print = 25, Input = 26, Assert = 27, Wait = 28, Size = 29, Def = 30, ToInt = 31,
            Create = 32, WebServer = 33, If = 34, Else = 35, Return = 36, For = 37, While = 38,
            To = 39, Do = 40, End = 41, In = 42, Null = 43, Try = 44, Catch = 45, Class = 46, CreateClass = 47,
            Or = 48, And = 49, Equals = 50, NEquals = 51, GTEquals = 52, LTEquals = 53, Pow = 54,
            Excl = 55, GT = 56, LT = 57, Add = 58, Subtract = 59, Multiply = 60, Divide = 61, Modulus = 62,
            OBrace = 63, CBrace = 64, OBracket = 65, CBracket = 66, OParen = 67, CParen = 68,
            SColon = 69, Assign = 70, Comma = 71, QMark = 72, Colon = 73, Bool = 74, Number = 75,
            Identifier = 76, String = 77, Comment = 78, JavaTextBlock = 79, Space = 80;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u0288\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3" +
                    "\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5" +
                    "\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3" +
                    "\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t" +
                    "\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3" +
                    "\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3" +
                    "\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3" +
                    "\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3" +
                    "\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3" +
                    "\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3" +
                    "\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3" +
                    "\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"" +
                    "\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&" +
                    "\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3," +
                    "\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60" +
                    "\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62" +
                    "\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66" +
                    "\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3" +
                    "A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\3K\3" +
                    "K\3K\3K\3K\3K\5K\u022d\nK\3L\3L\3L\7L\u0232\nL\fL\16L\u0235\13L\5L\u0237" +
                    "\nL\3M\3M\7M\u023b\nM\fM\16M\u023e\13M\3N\3N\3N\3N\7N\u0244\nN\fN\16N" +
                    "\u0247\13N\3N\3N\3N\3N\3N\7N\u024e\nN\fN\16N\u0251\13N\3N\5N\u0254\nN" +
                    "\3O\3O\3O\3O\7O\u025a\nO\fO\16O\u025d\13O\3O\3O\3O\3O\7O\u0263\nO\fO\16" +
                    "O\u0266\13O\3O\3O\5O\u026a\nO\3O\3O\3P\3P\3P\3P\7P\u0272\nP\fP\16P\u0275" +
                    "\13P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\7R\u027f\nR\fR\16R\u0282\13R\3R\5R\u0285" +
                    "\nR\3S\3S\3\u0264\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27" +
                    "\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33" +
                    "\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63" +
                    "e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089" +
                    "F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d" +
                    "P\u009fQ\u00a1R\u00a3\2\u00a5\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$" +
                    "\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17" +
                    "\"\"\3\2\63;\3\2\62;\2\u0295\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3" +
                    "\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2" +
                    "\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37" +
                    "\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3" +
                    "\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2" +
                    "\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C" +
                    "\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2" +
                    "\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2" +
                    "\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i" +
                    "\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2" +
                    "\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081" +
                    "\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2" +
                    "\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093" +
                    "\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2" +
                    "\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3\u00a7\3\2\2\2\5\u00a9" +
                    "\3\2\2\2\7\u00ab\3\2\2\2\t\u00b8\3\2\2\2\13\u00bd\3\2\2\2\r\u00c6\3\2" +
                    "\2\2\17\u00cd\3\2\2\2\21\u00d4\3\2\2\2\23\u00dd\3\2\2\2\25\u00df\3\2\2" +
                    "\2\27\u00e6\3\2\2\2\31\u00ed\3\2\2\2\33\u00fb\3\2\2\2\35\u0106\3\2\2\2" +
                    "\37\u0112\3\2\2\2!\u0117\3\2\2\2#\u011e\3\2\2\2%\u0128\3\2\2\2\'\u012f" +
                    "\3\2\2\2)\u0137\3\2\2\2+\u013b\3\2\2\2-\u0146\3\2\2\2/\u014a\3\2\2\2\61" +
                    "\u015f\3\2\2\2\63\u0166\3\2\2\2\65\u016e\3\2\2\2\67\u0174\3\2\2\29\u017b" +
                    "\3\2\2\2;\u0180\3\2\2\2=\u0185\3\2\2\2?\u018a\3\2\2\2A\u0190\3\2\2\2C" +
                    "\u0197\3\2\2\2E\u01a1\3\2\2\2G\u01a4\3\2\2\2I\u01a9\3\2\2\2K\u01b0\3\2" +
                    "\2\2M\u01b4\3\2\2\2O\u01ba\3\2\2\2Q\u01bd\3\2\2\2S\u01c0\3\2\2\2U\u01c5" +
                    "\3\2\2\2W\u01c8\3\2\2\2Y\u01cd\3\2\2\2[\u01d1\3\2\2\2]\u01d7\3\2\2\2_" +
                    "\u01dd\3\2\2\2a\u01e9\3\2\2\2c\u01ec\3\2\2\2e\u01ef\3\2\2\2g\u01f2\3\2" +
                    "\2\2i\u01f5\3\2\2\2k\u01f8\3\2\2\2m\u01fb\3\2\2\2o\u01fd\3\2\2\2q\u01ff" +
                    "\3\2\2\2s\u0201\3\2\2\2u\u0203\3\2\2\2w\u0205\3\2\2\2y\u0207\3\2\2\2{" +
                    "\u0209\3\2\2\2}\u020b\3\2\2\2\177\u020d\3\2\2\2\u0081\u020f\3\2\2\2\u0083" +
                    "\u0211\3\2\2\2\u0085\u0213\3\2\2\2\u0087\u0215\3\2\2\2\u0089\u0217\3\2" +
                    "\2\2\u008b\u0219\3\2\2\2\u008d\u021b\3\2\2\2\u008f\u021d\3\2\2\2\u0091" +
                    "\u021f\3\2\2\2\u0093\u0221\3\2\2\2\u0095\u022c\3\2\2\2\u0097\u022e\3\2" +
                    "\2\2\u0099\u0238\3\2\2\2\u009b\u0253\3\2\2\2\u009d\u0269\3\2\2\2\u009f" +
                    "\u026d\3\2\2\2\u00a1\u0278\3\2\2\2\u00a3\u0284\3\2\2\2\u00a5\u0286\3\2" +
                    "\2\2\u00a7\u00a8\7\60\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7&\2\2\u00aa\6\3" +
                    "\2\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7k\2\2\u00ae" +
                    "\u00af\7f\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2" +
                    "\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6" +
                    "\7n\2\2\u00b6\u00b7\7v\2\2\u00b7\b\3\2\2\2\u00b8\u00b9\7H\2\2\u00b9\u00ba" +
                    "\7k\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\n\3\2\2\2\u00bd\u00be" +
                    "\7p\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7\"\2\2\u00c1" +
                    "\u00c2\7H\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7g\2\2" +
                    "\u00c5\f\3\2\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7r" +
                    "\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7f\2\2\u00cc\16" +
                    "\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7t\2\2\u00d0" +
                    "\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7{\2\2\u00d3\20\3\2\2\2\u00d4" +
                    "\u00d5\7\60\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7h\2" +
                    "\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7n\2\2\u00db\u00dc" +
                    "\7v\2\2\u00dc\22\3\2\2\2\u00dd\u00de\7%\2\2\u00de\24\3\2\2\2\u00df\u00e0" +
                    "\7i\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7j\2\2\u00e3" +
                    "\u00e4\7w\2\2\u00e4\u00e5\7d\2\2\u00e5\26\3\2\2\2\u00e6\u00e7\7Y\2\2\u00e7" +
                    "\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7q\2\2" +
                    "\u00eb\u00ec\7y\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7" +
                    "g\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2\7E\2\2\u00f2" +
                    "\u00f3\7q\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7q\2\2" +
                    "\u00f6\u00f7\7p\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa" +
                    "\7v\2\2\u00fa\32\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7j\2\2\u00fd\u00fe" +
                    "\7c\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7i\2\2\u0100\u0101\7g\2\2\u0101" +
                    "\u0102\7V\2\2\u0102\u0103\7g\2\2\u0103\u0104\7z\2\2\u0104\u0105\7v\2\2" +
                    "\u0105\34\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108\7w\2\2\u0108\u0109\7" +
                    "p\2\2\u0109\u010a\7e\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7o\2\2\u010c" +
                    "\u010d\7c\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f\u0110\7*\2\2" +
                    "\u0110\u0111\7+\2\2\u0111\36\3\2\2\2\u0112\u0113\7g\2\2\u0113\u0114\7" +
                    "p\2\2\u0114\u0115\7f\2\2\u0115\u0116\7e\2\2\u0116 \3\2\2\2\u0117\u0118" +
                    "\7u\2\2\u0118\u0119\7v\2\2\u0119\u011a\7f\2\2\u011a\u011b\7<\2\2\u011b" +
                    "\u011c\7n\2\2\u011c\u011d\7p\2\2\u011d\"\3\2\2\2\u011e\u011f\7E\2\2\u011f" +
                    "\u0120\7q\2\2\u0120\u0121\7o\2\2\u0121\u0122\7r\2\2\u0122\u0123\7q\2\2" +
                    "\u0123\u0124\7p\2\2\u0124\u0125\7g\2\2\u0125\u0126\7p\2\2\u0126\u0127" +
                    "\7v\2\2\u0127$\3\2\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b" +
                    "\7p\2\2\u012b\u012c\7f\2\2\u012c\u012d\7g\2\2\u012d\u012e\7t\2\2\u012e" +
                    "&\3\2\2\2\u012f\u0130\7c\2\2\u0130\u0131\7f\2\2\u0131\u0132\7f\2\2\u0132" +
                    "\u0133\7E\2\2\u0133\u0134\7q\2\2\u0134\u0135\7o\2\2\u0135\u0136\7r\2\2" +
                    "\u0136(\3\2\2\2\u0137\u0138\7p\2\2\u0138\u0139\7g\2\2\u0139\u013a\7y\2" +
                    "\2\u013a*\3\2\2\2\u013b\u013c\7p\2\2\u013c\u013d\7g\2\2\u013d\u013e\7" +
                    "y\2\2\u013e\u013f\7\"\2\2\u013f\u0140\7Y\2\2\u0140\u0141\7k\2\2\u0141" +
                    "\u0142\7p\2\2\u0142\u0143\7f\2\2\u0143\u0144\7q\2\2\u0144\u0145\7y\2\2" +
                    "\u0145,\3\2\2\2\u0146\u0147\7x\2\2\u0147\u0148\7c\2\2\u0148\u0149\7t\2" +
                    "\2\u0149.\3\2\2\2\u014a\u014b\7Y\2\2\u014b\u014c\7g\2\2\u014c\u014d\7" +
                    "d\2\2\u014d\u014e\7U\2\2\u014e\u014f\7g\2\2\u014f\u0150\7t\2\2\u0150\u0151" +
                    "\7x\2\2\u0151\u0152\7g\2\2\u0152\u0153\7t\2\2\u0153\u0154\7\60\2\2\u0154" +
                    "\u0155\7e\2\2\u0155\u0156\7j\2\2\u0156\u0157\7c\2\2\u0157\u0158\7p\2\2" +
                    "\u0158\u0159\7i\2\2\u0159\u015a\7g\2\2\u015a\u015b\7V\2\2\u015b\u015c" +
                    "\7g\2\2\u015c\u015d\7z\2\2\u015d\u015e\7v\2\2\u015e\60\3\2\2\2\u015f\u0160" +
                    "\7k\2\2\u0160\u0161\7o\2\2\u0161\u0162\7r\2\2\u0162\u0163\7q\2\2\u0163" +
                    "\u0164\7t\2\2\u0164\u0165\7v\2\2\u0165\62\3\2\2\2\u0166\u0167\7u\2\2\u0167" +
                    "\u0168\7v\2\2\u0168\u0169\7f\2\2\u0169\u016a\7<\2\2\u016a\u016b\7q\2\2" +
                    "\u016b\u016c\7w\2\2\u016c\u016d\7v\2\2\u016d\64\3\2\2\2\u016e\u016f\7" +
                    "k\2\2\u016f\u0170\7p\2\2\u0170\u0171\7r\2\2\u0171\u0172\7w\2\2\u0172\u0173" +
                    "\7v\2\2\u0173\66\3\2\2\2\u0174\u0175\7c\2\2\u0175\u0176\7u\2\2\u0176\u0177" +
                    "\7u\2\2\u0177\u0178\7g\2\2\u0178\u0179\7t\2\2\u0179\u017a\7v\2\2\u017a" +
                    "8\3\2\2\2\u017b\u017c\7y\2\2\u017c\u017d\7c\2\2\u017d\u017e\7k\2\2\u017e" +
                    "\u017f\7v\2\2\u017f:\3\2\2\2\u0180\u0181\7u\2\2\u0181\u0182\7k\2\2\u0182" +
                    "\u0183\7|\2\2\u0183\u0184\7g\2\2\u0184<\3\2\2\2\u0185\u0186\7h\2\2\u0186" +
                    "\u0187\7w\2\2\u0187\u0188\7p\2\2\u0188\u0189\7e\2\2\u0189>\3\2\2\2\u018a" +
                    "\u018b\7v\2\2\u018b\u018c\7q\2\2\u018c\u018d\7K\2\2\u018d\u018e\7p\2\2" +
                    "\u018e\u018f\7v\2\2\u018f@\3\2\2\2\u0190\u0191\7e\2\2\u0191\u0192\7t\2" +
                    "\2\u0192\u0193\7g\2\2\u0193\u0194\7c\2\2\u0194\u0195\7v\2\2\u0195\u0196" +
                    "\7g\2\2\u0196B\3\2\2\2\u0197\u0198\7Y\2\2\u0198\u0199\7g\2\2\u0199\u019a" +
                    "\7d\2\2\u019a\u019b\7U\2\2\u019b\u019c\7g\2\2\u019c\u019d\7t\2\2\u019d" +
                    "\u019e\7x\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7t\2\2\u01a0D\3\2\2\2\u01a1" +
                    "\u01a2\7k\2\2\u01a2\u01a3\7h\2\2\u01a3F\3\2\2\2\u01a4\u01a5\7g\2\2\u01a5" +
                    "\u01a6\7n\2\2\u01a6\u01a7\7u\2\2\u01a7\u01a8\7g\2\2\u01a8H\3\2\2\2\u01a9" +
                    "\u01aa\7t\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7w\2\2" +
                    "\u01ad\u01ae\7t\2\2\u01ae\u01af\7p\2\2\u01afJ\3\2\2\2\u01b0\u01b1\7h\2" +
                    "\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7t\2\2\u01b3L\3\2\2\2\u01b4\u01b5\7" +
                    "y\2\2\u01b5\u01b6\7j\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7n\2\2\u01b8\u01b9" +
                    "\7g\2\2\u01b9N\3\2\2\2\u01ba\u01bb\7v\2\2\u01bb\u01bc\7q\2\2\u01bcP\3" +
                    "\2\2\2\u01bd\u01be\7f\2\2\u01be\u01bf\7q\2\2\u01bfR\3\2\2\2\u01c0\u01c1" +
                    "\7g\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7f\2\2\u01c3\u01c4\7h\2\2\u01c4" +
                    "T\3\2\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7p\2\2\u01c7V\3\2\2\2\u01c8\u01c9" +
                    "\7p\2\2\u01c9\u01ca\7w\2\2\u01ca\u01cb\7n\2\2\u01cb\u01cc\7n\2\2\u01cc" +
                    "X\3\2\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7t\2\2\u01cf\u01d0\7{\2\2\u01d0" +
                    "Z\3\2\2\2\u01d1\u01d2\7e\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7v\2\2\u01d4" +
                    "\u01d5\7e\2\2\u01d5\u01d6\7j\2\2\u01d6\\\3\2\2\2\u01d7\u01d8\7e\2\2\u01d8" +
                    "\u01d9\7n\2\2\u01d9\u01da\7c\2\2\u01da\u01db\7u\2\2\u01db\u01dc\7u\2\2" +
                    "\u01dc^\3\2\2\2\u01dd\u01de\7e\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7g\2" +
                    "\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4" +
                    "\7E\2\2\u01e4\u01e5\7n\2\2\u01e5\u01e6\7c\2\2\u01e6\u01e7\7u\2\2\u01e7" +
                    "\u01e8\7u\2\2\u01e8`\3\2\2\2\u01e9\u01ea\7~\2\2\u01ea\u01eb\7~\2\2\u01eb" +
                    "b\3\2\2\2\u01ec\u01ed\7(\2\2\u01ed\u01ee\7(\2\2\u01eed\3\2\2\2\u01ef\u01f0" +
                    "\7?\2\2\u01f0\u01f1\7?\2\2\u01f1f\3\2\2\2\u01f2\u01f3\7#\2\2\u01f3\u01f4" +
                    "\7?\2\2\u01f4h\3\2\2\2\u01f5\u01f6\7@\2\2\u01f6\u01f7\7?\2\2\u01f7j\3" +
                    "\2\2\2\u01f8\u01f9\7>\2\2\u01f9\u01fa\7?\2\2\u01fal\3\2\2\2\u01fb\u01fc" +
                    "\7`\2\2\u01fcn\3\2\2\2\u01fd\u01fe\7#\2\2\u01fep\3\2\2\2\u01ff\u0200\7" +
                    "@\2\2\u0200r\3\2\2\2\u0201\u0202\7>\2\2\u0202t\3\2\2\2\u0203\u0204\7-" +
                    "\2\2\u0204v\3\2\2\2\u0205\u0206\7/\2\2\u0206x\3\2\2\2\u0207\u0208\7,\2" +
                    "\2\u0208z\3\2\2\2\u0209\u020a\7\61\2\2\u020a|\3\2\2\2\u020b\u020c\7\'" +
                    "\2\2\u020c~\3\2\2\2\u020d\u020e\7}\2\2\u020e\u0080\3\2\2\2\u020f\u0210" +
                    "\7\177\2\2\u0210\u0082\3\2\2\2\u0211\u0212\7]\2\2\u0212\u0084\3\2\2\2" +
                    "\u0213\u0214\7_\2\2\u0214\u0086\3\2\2\2\u0215\u0216\7*\2\2\u0216\u0088" +
                    "\3\2\2\2\u0217\u0218\7+\2\2\u0218\u008a\3\2\2\2\u0219\u021a\7=\2\2\u021a" +
                    "\u008c\3\2\2\2\u021b\u021c\7?\2\2\u021c\u008e\3\2\2\2\u021d\u021e\7.\2" +
                    "\2\u021e\u0090\3\2\2\2\u021f\u0220\7A\2\2\u0220\u0092\3\2\2\2\u0221\u0222" +
                    "\7<\2\2\u0222\u0094\3\2\2\2\u0223\u0224\7v\2\2\u0224\u0225\7t\2\2\u0225" +
                    "\u0226\7w\2\2\u0226\u022d\7g\2\2\u0227\u0228\7h\2\2\u0228\u0229\7c\2\2" +
                    "\u0229\u022a\7n\2\2\u022a\u022b\7u\2\2\u022b\u022d\7g\2\2\u022c\u0223" +
                    "\3\2\2\2\u022c\u0227\3\2\2\2\u022d\u0096\3\2\2\2\u022e\u0236\5\u00a3R" +
                    "\2\u022f\u0233\7\60\2\2\u0230\u0232\5\u00a5S\2\u0231\u0230\3\2\2\2\u0232" +
                    "\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2" +
                    "\2\2\u0235\u0233\3\2\2\2\u0236\u022f\3\2\2\2\u0236\u0237\3\2\2\2\u0237" +
                    "\u0098\3\2\2\2\u0238\u023c\t\2\2\2\u0239\u023b\t\3\2\2\u023a\u0239\3\2" +
                    "\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d" +
                    "\u009a\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0245\t\4\2\2\u0240\u0244\n\5" +
                    "\2\2\u0241\u0242\7^\2\2\u0242\u0244\n\6\2\2\u0243\u0240\3\2\2\2\u0243" +
                    "\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2" +
                    "\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0254\t\4\2\2\u0249" +
                    "\u024f\t\7\2\2\u024a\u024e\n\b\2\2\u024b\u024c\7^\2\2\u024c\u024e\n\6" +
                    "\2\2\u024d\u024a\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0251\3\2\2\2\u024f" +
                    "\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u024f\3\2" +
                    "\2\2\u0252\u0254\t\7\2\2\u0253\u023f\3\2\2\2\u0253\u0249\3\2\2\2\u0254" +
                    "\u009c\3\2\2\2\u0255\u0256\7\61\2\2\u0256\u0257\7\61\2\2\u0257\u025b\3" +
                    "\2\2\2\u0258\u025a\n\6\2\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b" +
                    "\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u026a\3\2\2\2\u025d\u025b\3\2" +
                    "\2\2\u025e\u025f\7\61\2\2\u025f\u0260\7,\2\2\u0260\u0264\3\2\2\2\u0261" +
                    "\u0263\13\2\2\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0265\3" +
                    "\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267" +
                    "\u0268\7,\2\2\u0268\u026a\7\61\2\2\u0269\u0255\3\2\2\2\u0269\u025e\3\2" +
                    "\2\2\u026a\u026b\3\2\2\2\u026b\u026c\bO\2\2\u026c\u009e\3\2\2\2\u026d" +
                    "\u0273\t\4\2\2\u026e\u0272\n\4\2\2\u026f\u0270\7^\2\2\u0270\u0272\n\6" +
                    "\2\2\u0271\u026e\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273" +
                    "\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2" +
                    "\2\2\u0276\u0277\t\4\2\2\u0277\u00a0\3\2\2\2\u0278\u0279\t\t\2\2\u0279" +
                    "\u027a\3\2\2\2\u027a\u027b\bQ\2\2\u027b\u00a2\3\2\2\2\u027c\u0280\t\n" +
                    "\2\2\u027d\u027f\5\u00a5S\2\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280" +
                    "\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0285\3\2\2\2\u0282\u0280\3\2" +
                    "\2\2\u0283\u0285\7\62\2\2\u0284\u027c\3\2\2\2\u0284\u0283\3\2\2\2\u0285" +
                    "\u00a4\3\2\2\2\u0286\u0287\t\13\2\2\u0287\u00a6\3\2\2\2\23\2\u022c\u0233" +
                    "\u0236\u023c\u0243\u0245\u024d\u024f\u0253\u025b\u0264\u0269\u0271\u0273" +
                    "\u0280\u0284\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public QLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "Println", "Component",
                "Render", "AddComponent", "New", "Window", "Var", "AddWSText", "Import",
                "Print", "Input", "Assert", "Wait", "Size", "Def", "ToInt", "Create",
                "WebServer", "If", "Else", "Return", "For", "While", "To", "Do", "End",
                "In", "Null", "Try", "Catch", "Class", "CreateClass", "Or", "And", "Equals",
                "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add",
                "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket",
                "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark",
                "Colon", "Bool", "Number", "Identifier", "String", "Comment", "JavaTextBlock",
                "Space", "Int", "Digit"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'.'", "'$'", "'void default'", "'File'", "'new File'", "'append'",
                "'verify'", "'.default'", "'#'", "'github'", "'Window'", "'new Component'",
                "'changeText'", "'func main()'", "'endc'", "'std:ln'", "'Component'",
                "'render'", "'addComp'", "'new'", "'new Window'", "'var'", "'WebServer.changeText'",
                "'import'", "'std:out'", "'input'", "'assert'", "'wait'", "'size'", "'func'",
                "'toInt'", "'create'", "'WebServer'", "'if'", "'else'", "'return'", "'for'",
                "'while'", "'to'", "'do'", "'endf'", "'in'", "'null'", "'try'", "'catch'",
                "'class'", "'createClass'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='",
                "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'",
                "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, "Println", "Component", "Render", "AddComponent",
                "New", "Window", "Var", "AddWSText", "Import", "Print", "Input", "Assert",
                "Wait", "Size", "Def", "ToInt", "Create", "WebServer", "If", "Else",
                "Return", "For", "While", "To", "Do", "End", "In", "Null", "Try", "Catch",
                "Class", "CreateClass", "Or", "And", "Equals", "NEquals", "GTEquals",
                "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply",
                "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen",
                "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", "Number",
                "Identifier", "String", "Comment", "JavaTextBlock", "Space"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Q.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}