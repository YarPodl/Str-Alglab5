package Main;

import javax.swing.table.AbstractTableModel;
import java.util.Vector;

public class MyTableModel extends AbstractTableModel {

    private Vector<String> columnNames;
    private Vector<int[]> tableData;

    public MyTableModel(Vector<int[]> tableData)
    {
        super();
        columnNames = new Vector<>();
        columnNames.add("Номер");
        for (int i = 1; i < tableData.get(0).length + 1; i++) {
            columnNames.add("№ " + Integer.toString(i));
        }
        this.tableData = new Vector<>(tableData);
    }

    public int getColumnCount()
    {
        return columnNames.size();
    }

    public int getRowCount()
    {
        return tableData.size();
    }

    public Object getValueAt(int row, int column)
    {
        if (column == 0){
            return "Шаг " + Integer.toString(row);
        } else {
            return tableData.get(row)[column - 1];
        }
    }

    // заголовки столбцов;
    public String getColumnName(int column)
    {
        return columnNames.get(column);
    }

}

