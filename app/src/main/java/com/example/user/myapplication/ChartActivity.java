package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        WebView webView = (WebView) findViewById(R.id.WebView);

        String page = "  <html>\n" +
                "  <head>\n" +
                "  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                "  <script>\n" +
                "  google.charts.load('current', {packages: ['corechart', 'bar']});\n" +
                "google.charts.setOnLoadCallback(drawStacked);\n" +
                "\n" +
                "function drawStacked() {\n" +
                "      var data = new google.visualization.DataTable();\n" +
                "      data.addColumn('timeofday', 'Time of Day');\n" +
                "      data.addColumn('number', 'Motivation Level');\n" +
                "      data.addColumn('number', 'Energy Level');\n" +
                "\n" +
                "      data.addRows([\n" +
                "        [{v: [8, 0, 0], f: '8 am'}, 1, .25],\n" +
                "        [{v: [9, 0, 0], f: '9 am'}, 2, .5],\n" +
                "        [{v: [10, 0, 0], f:'10 am'}, 3, 1],\n" +
                "        [{v: [11, 0, 0], f: '11 am'}, 4, 2.25],\n" +
                "        [{v: [12, 0], f: '12 pm'}, 5, 2.25],\n" +
                "        [{v: [13, 0], f: '1 pm'}, 6, 3],\n" +
                "        [{v: [14, 0], f: '2 pm'}, 7, 4],\n" +
                "        [{v: [15, 0], f: '3 pm'}, 8, 5.25],\n" +
                "        [{v: [16, 0], f: '4 pm'}, 9, 7.5],\n" +
                "        [{v: [17, 0], f: '5 pm'}, 10, 10],\n" +
                "      ]);\n" +
                "\n" +
                "      var options = {\n" +
                "        title: 'Motivation and Energy Level Throughout the Day',\n" +
                "        isStacked: true,\n" +
                "        hAxis: {\n" +
                "          title: 'Time',\n" +
                "          format: 'h:mm a',\n" +
                "          viewWindow: {\n" +
                "            min: [7, 30, 0],\n" +
                "            max: [17, 30, 0]\n" +
                "          }\n" +
                "        },\n" +
                "        vAxis: {\n" +
                "          title: 'Amount of ...'\n" +
                "        }\n" +
                "      };\n" +
                "\n" +
                "      var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));\n" +
                "      chart.draw(data, options);\n" +
                "    }\n" +
                "  </script>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div id=\"chart_div\"></div>\n" +
                "\n" +
                "  </body>\n" +
                "  </html>";

        //webView.loadUrl("https://www.google.com");

        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);

        webView.loadDataWithBaseURL("file://andoid_asset/", page, "text/html", "utf-8", null);
    }
}
