package org.lyg.db.reflection;
import java.util.concurrent.ConcurrentHashMap;
@SuppressWarnings("unused")
public class Row{
	public ConcurrentHashMap<String, Cell> getCells() {
		return cells;
	}

	public void setCells(ConcurrentHashMap<String, Cell> cells) {
		this.cells = cells;
	}

	public Cell getTable(String cellName) {
		if(cells.containsKey(cellName)) {
			return cells.get(cellName);
		}
		return null;	
	}

	public void putCell(String cellName, Cell cell) {
		this.cells.put(cellName, cell);
	}

	private ConcurrentHashMap<String, Cell> cells;
}