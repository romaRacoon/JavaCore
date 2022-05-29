public class Test {
    public static void main(String[] args) {
        String text = "asghdalskjdkjalwd:(";
        String[] spams = {"1","2"};
        TextAnalyzer[] textAnalyzers = {new SpamAnalyzer(spams), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(1)};
        Test test = new Test();
        System.out.println(test.checkLabels(textAnalyzers,text));
    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) == Label.SPAM) {
                return Label.SPAM;
            } else if (analyzers[i].processText(text) == Label.NEGATIVE_TEXT) {
                return Label.NEGATIVE_TEXT;
            } else if (analyzers[i].processText(text) == Label.TOO_LONG) {
                return Label.TOO_LONG;
            }
        }
        return Label.OK;
    }
}
