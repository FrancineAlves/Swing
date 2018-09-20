/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author crfranco
 */


import java.util.ArrayList;
import java.util.List;
import model.Programador;

public class ProgramadorTableModel extends GenericTableModel<Programador> {
	private String[] columnNames = { "Codigo", "Nome", "Sexo", "Cidade", "Observacao" };
	
        
        private ArrayList<Programador> programadorList;
	
        public ProgramadorTableModel() {
		programadorList = new ArrayList<Programador>();
	}
	public ProgramadorTableModel(List<Programador> programadorList) {
		this();
		setData(programadorList);
	}
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}
	public String[] getColumnNames() {
		return columnNames;
	}
	@Override
	public void setData(List<Programador> list) {
		this.programadorList.clear();
		this.programadorList.addAll(list);
		super.fireTableDataChanged();
	}
	@Override
	public Programador getValueAt(int row) {
		return programadorList.get(row);
	}
	@Override
	public int indexOf(Programador entity) {
		return programadorList.indexOf(entity);
	}
	@Override
	public void clear() {
		this.programadorList.clear();
		super.fireTableDataChanged();
	}
	public void remove(Programador entity) {
		programadorList.remove(entity);
		super.fireTableDataChanged();
	}
	public void add(Programador entity) {
		programadorList.add(0, entity);
		super.fireTableDataChanged();
	}
	public boolean contains(Programador entity) {
		return programadorList.contains(entity);
	}
	public int getRowCount() {
		return programadorList.size();
	}
	public int getColumnCount() {
		return columnNames.length;
	}
	public Object getValueAt(int rowIndex, int columnIndex) {
		Programador programador = programadorList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return programador.getCodigo();
		case 1:
			return programador.getNome();
		case 2:
			return programador.getSexo();
                case 3:
			return programador.getCidade();
                case 4:
			return programador.getObservacao();
		}
		return null;
	}
	@Override
	public List<Programador> list() {
		return programadorList;
	}
	@Override
	public void updateItem(int idx, Programador entity) {
		programadorList.set(idx, entity);
		super.fireTableDataChanged();
	}

}

