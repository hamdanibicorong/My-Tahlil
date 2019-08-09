package com.hamdani.myuixdlayout.db;

import android.provider.BaseColumns;

/**
 * Created by linuxluv on 07/03/18.
 */

public class AgendaDbInfo {
    public static final String DB_NAME = "io.github.ardhiesta.agendaharian.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "agenda";
        public static final String COL_TODO_TITLE = "todo";
    }
}
