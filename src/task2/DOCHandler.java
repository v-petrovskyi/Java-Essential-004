package task2;

class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("you open DOC file");
    }

    @Override
    void create() {
        System.out.println("you create DOC file");
    }

    @Override
    void change() {
        System.out.println("you change DOC file");
    }

    @Override
    void save() {
        System.out.println("you save DOC file");
    }
}
