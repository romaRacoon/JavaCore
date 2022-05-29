public class Test {
    public static void main(String[] args) {
        String text = "asghdalskjdkjalwd";
        String[] spams = {"1","2"};
        TextAnalyzer[] textAnalyzers = {new SpamAnalyzer(spams),new NegativeTextAnalyzer(), new TooLongTextAnalyzer(30)};
        Test test = new Test();
        test.checkLabels(textAnalyzers,text);
    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                if (i + 1 == 1) {
                    return analyzers[i].processText(text);
                }
            }
        }
        return Label.OK;
    }
}
