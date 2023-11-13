package decoratorPattern;

import java.util.ArrayList;
import java.util.List;

class Widget {
    private int rank;

    public Widget(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}

class Page {
    private List<Widget> widgets;
    private int rank;

    public Page() {
        this.widgets = new ArrayList<>();
        this.rank = 0;
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
        rank += widget.getRank();
    }

    public int getRank() {
        return rank;
    }
}

public class PageRankCalculator {
    public static void main(String[] args) {
        Widget widget1 = new Widget(3);
        Widget widget2 = new Widget(5);
        Widget widget3 = new Widget(2);

        Page page = new Page();

        page.addWidget(widget1);
        page.addWidget(widget2);
        page.addWidget(widget3);

        int pageRank = page.getRank();
        System.out.println("Page Rank: " + pageRank);
    }
}
