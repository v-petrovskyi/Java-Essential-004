package task2;

class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("you open XML file");
    }

    @Override
    void create() {
        System.out.println("you create XML file");
    }

    @Override
    void change() {
        System.out.println("you change XML file");
    }

    @Override
    void save() {
        System.out.println("you save XML file");
    }
}
