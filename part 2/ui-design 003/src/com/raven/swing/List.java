package com.raven.swing;

import com.raven.model.Model_Data;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class List<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public List() {
        model = new DefaultListModel();
        setModel(model);
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_Data data;
                if (o instanceof Model_Data) {
                    data = (Model_Data) o;
                } else {
                    data = new Model_Data(false, o + "");
                }
                Item item = new Item(data);
                return item;
            }
        };
    }

    public void addItem(Model_Data data) {
        model.addElement(data);
    }
}
