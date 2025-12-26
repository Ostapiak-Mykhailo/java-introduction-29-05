package com.hillel.classwork.lesson14.html;

public class HtmlGenerator {

    public static void main(String[] args) {

        String htmlText = "<html>" +
                "<body>" +
                "<div>" +
                "<div>Hello!</div>" +
                "</div>" +
                "</body>" +
                "</html>";

        HtmlTag div = new HtmlTag("div", "Hello");
        HtmlTag div1 = new HtmlTag("div", div);
        HtmlTag body = new HtmlTag("body", div1);
        HtmlTag html = new HtmlTag("html", body);

        System.out.println(generateHtml(div));

    }

    public static String generateHtml(HtmlTag htmlTag){

        // якщо у об'єкта є child то потрібно рекурсивно відмалювати його
        return "<" + htmlTag.name + ">" + htmlTag.text + "</" + htmlTag.name + ">";
    }
}
