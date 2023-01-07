package swing.grundkursJava.layout;

import swing.grundkursJava.layout.baseclasses.BaseLayout;
import swing.grundkursJava.layout.baseclasses.MyPanel;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class GridBagLayoutTest extends BaseLayout {
    public GridBagLayoutTest(){
        super("GridBagLayout");
    }

    private void addPanel(GridBagLayout gridbag, MyPanel p, int x, int y, int w, int h){
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(2, 2, 2, 2);
        constr.gridx = x;
        constr.gridy = y;
        constr.gridwidth = w;
        constr.gridheight = h;
        constr.fill = GridBagConstraints.BOTH;
        constr.weightx = 1;
        constr.weighty = 1;
        gridbag.setConstraints(p, constr);
        add(p);
    }
    @Override
    public void setContent(Container container) {
        MyPanel[] p = new MyPanel[10];
        for (int i = 0; i < p.length; i++)
            p[i] = new MyPanel(i + 1);

        GridBagLayout gridbag = new GridBagLayout();
        container.setLayout(gridbag);

        addPanel(gridbag, p[0], 2, 0, 1, 1);
        addPanel(gridbag, p[1], 0, 1, 1, 1);
        addPanel(gridbag, p[2], 1, 1, 1, 1);
        addPanel(gridbag, p[3], 2, 1, 1, 1);
        addPanel(gridbag, p[4], 0, 2, 1, 2);
        addPanel(gridbag, p[5], 1, 2, 2, 1);
        addPanel(gridbag, p[6], 1, 3, 2, 1);
        addPanel(gridbag, p[7], 1, 4, 1, 1);
        addPanel(gridbag, p[8], 2, 4, 1, 1);
        addPanel(gridbag, p[9], 0, 5, 3, 1);
    }

    public static void main(String[] args) {
        new GridBagLayoutTest();
    }
}
