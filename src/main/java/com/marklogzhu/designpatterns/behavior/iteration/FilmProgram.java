package com.marklogzhu.designpatterns.behavior.iteration;

public class FilmProgram implements Program {
    /**
     * 菜单最大长度
     */
    static final int MAX_ITEMS = 5;
    String[] filmItems;
    int index = 0;

    public FilmProgram() {
        filmItems = new String[MAX_ITEMS];
        addItem("大圣归来");
        addItem("大圣又归来");
        addItem("大圣还归来");
        addItem("大圣来都来了");
        addItem("大圣什么时候走");
    }

    @Override
    public void addItem(String title) {
        if (index > MAX_ITEMS) {
            System.out.println("容量已满....");
            return;
        }
        filmItems[index] = title;
        index++;
    }

    @Override
    public Iterator createIrerator() {
        return new FilmIterator(filmItems);
    }
}
