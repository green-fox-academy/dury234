public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("My todo:\n").append(todoText).append(" - Download games\n\t- Diablo");

        todoText = stringBuilder.toString();
        System.out.println(todoText);
    }
}
