/*
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2013 JSQLParser
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
package net.sf.jsqlparser.statement.select;

/**
 * All the columns of a table (as in "SELECT TableName.* FROM ...")
 */

import net.sf.jsqlparser.schema.*;

public class AllTableColumns extends Column implements SelectItem {
    public AllTableColumns(Table table) {
        super(table, "*");
    }

    @Override
    public void accept(SelectItemVisitor selectItemVisitor) {
        selectItemVisitor.visit(this);
    }
}
