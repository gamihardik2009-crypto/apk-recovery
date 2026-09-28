package t1;

import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import n2.AbstractC0948C;
import n2.AbstractC0949a;
import n2.AbstractC0959k;
import n2.AbstractC0961m;
import n2.AbstractC0962n;
import n2.C0971w;
import o2.C0996b;
import o2.C1000f;
import o2.C1002h;
import w1.C1380b;
import z2.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10662a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10663b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f10664c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f10665d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        h.f(abstractSet, "foreignKeys");
        this.f10662a = str;
        this.f10663b = map;
        this.f10664c = abstractSet;
        this.f10665d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(C1380b c1380b, String str) {
        Map b3;
        List n3;
        C1002h c1002h;
        C1002h c1002h2;
        int i2;
        String str2;
        int i3;
        int i4;
        Throwable th;
        d dVar;
        C1380b c1380b2 = c1380b;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        String str3 = "`)";
        sb.append("`)");
        Cursor j3 = c1380b2.j(sb.toString());
        try {
            String str4 = "name";
            if (j3.getColumnCount() <= 0) {
                b3 = C0971w.f9166h;
                AbstractC0949a.h(j3, null);
            } else {
                int columnIndex = j3.getColumnIndex("name");
                int columnIndex2 = j3.getColumnIndex("type");
                int columnIndex3 = j3.getColumnIndex("notnull");
                int columnIndex4 = j3.getColumnIndex("pk");
                int columnIndex5 = j3.getColumnIndex("dflt_value");
                C1000f c1000f = new C1000f();
                while (j3.moveToNext()) {
                    String string = j3.getString(columnIndex);
                    String string2 = j3.getString(columnIndex2);
                    boolean z3 = j3.getInt(columnIndex3) != 0;
                    int i5 = j3.getInt(columnIndex4);
                    String string3 = j3.getString(columnIndex5);
                    h.e(string, "name");
                    h.e(string2, "type");
                    c1000f.put(string, new C1268a(string, string2, z3, i5, string3, 2));
                    columnIndex = columnIndex;
                }
                b3 = c1000f.b();
                AbstractC0949a.h(j3, null);
            }
            j3 = c1380b2.j("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = j3.getColumnIndex("id");
                int columnIndex7 = j3.getColumnIndex("seq");
                int columnIndex8 = j3.getColumnIndex("table");
                int columnIndex9 = j3.getColumnIndex("on_delete");
                int columnIndex10 = j3.getColumnIndex("on_update");
                int columnIndex11 = j3.getColumnIndex("id");
                int columnIndex12 = j3.getColumnIndex("seq");
                int columnIndex13 = j3.getColumnIndex("from");
                int columnIndex14 = j3.getColumnIndex("to");
                Map map = b3;
                C0996b c0996b = new C0996b(10);
                while (j3.moveToNext()) {
                    String str5 = str4;
                    int i6 = j3.getInt(columnIndex11);
                    int i7 = columnIndex11;
                    int i8 = j3.getInt(columnIndex12);
                    int i9 = columnIndex12;
                    String string4 = j3.getString(columnIndex13);
                    int i10 = columnIndex13;
                    h.e(string4, "cursor.getString(fromColumnIndex)");
                    String string5 = j3.getString(columnIndex14);
                    h.e(string5, "cursor.getString(toColumnIndex)");
                    c0996b.add(new c(i6, i8, string4, string5));
                    str4 = str5;
                    columnIndex11 = i7;
                    columnIndex12 = i9;
                    columnIndex13 = i10;
                    columnIndex14 = columnIndex14;
                }
                String str6 = str4;
                C0996b e3 = AbstractC0962n.e(c0996b);
                h.f(e3, "<this>");
                if (e3.a() <= 1) {
                    n3 = AbstractC0961m.X(e3);
                } else {
                    Object[] array = e3.toArray(new Comparable[0]);
                    Comparable[] comparableArr = (Comparable[]) array;
                    if (comparableArr.length > 1) {
                        Arrays.sort(comparableArr);
                    }
                    n3 = AbstractC0959k.n(array);
                }
                j3.moveToPosition(-1);
                C1002h c1002h3 = new C1002h();
                while (j3.moveToNext()) {
                    if (j3.getInt(columnIndex7) == 0) {
                        int i11 = j3.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : n3) {
                            List list = n3;
                            if (((c) obj).f10654h == i11) {
                                arrayList3.add(obj);
                            }
                            n3 = list;
                        }
                        List list2 = n3;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f10656j);
                            arrayList2.add(cVar.f10657k);
                        }
                        String string6 = j3.getString(columnIndex8);
                        h.e(string6, "cursor.getString(tableColumnIndex)");
                        String string7 = j3.getString(columnIndex9);
                        h.e(string7, "cursor.getString(onDeleteColumnIndex)");
                        String string8 = j3.getString(columnIndex10);
                        h.e(string8, "cursor.getString(onUpdateColumnIndex)");
                        c1002h3.add(new b(string6, string7, string8, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        n3 = list2;
                    }
                }
                C1002h f3 = AbstractC0948C.f(c1002h3);
                AbstractC0949a.h(j3, null);
                j3 = c1380b2.j("PRAGMA index_list(`" + str + "`)");
                String str7 = str6;
                try {
                    int columnIndex15 = j3.getColumnIndex(str7);
                    int columnIndex16 = j3.getColumnIndex("origin");
                    int columnIndex17 = j3.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        c1002h = null;
                        AbstractC0949a.h(j3, null);
                    } else {
                        C1002h c1002h4 = new C1002h();
                        while (j3.moveToNext()) {
                            if (h.a("c", j3.getString(columnIndex16))) {
                                String string9 = j3.getString(columnIndex15);
                                boolean z4 = j3.getInt(columnIndex17) == 1;
                                h.e(string9, str7);
                                j3 = c1380b2.j("PRAGMA index_xinfo(`" + string9 + str3);
                                try {
                                    int columnIndex18 = j3.getColumnIndex("seqno");
                                    int columnIndex19 = j3.getColumnIndex("cid");
                                    int columnIndex20 = j3.getColumnIndex(str7);
                                    int columnIndex21 = j3.getColumnIndex("desc");
                                    String str8 = str7;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        i2 = columnIndex15;
                                        str2 = str3;
                                        i3 = columnIndex16;
                                        i4 = columnIndex17;
                                        th = null;
                                        AbstractC0949a.h(j3, null);
                                        dVar = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        i2 = columnIndex15;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (j3.moveToNext()) {
                                            if (j3.getInt(columnIndex19) >= 0) {
                                                int i12 = j3.getInt(columnIndex18);
                                                String str9 = str3;
                                                String string10 = j3.getString(columnIndex20);
                                                int i13 = columnIndex21;
                                                String str10 = j3.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i14 = columnIndex16;
                                                Integer valueOf = Integer.valueOf(i12);
                                                h.e(string10, "columnName");
                                                treeMap.put(valueOf, string10);
                                                treeMap2.put(Integer.valueOf(i12), str10);
                                                str3 = str9;
                                                columnIndex16 = i14;
                                                columnIndex21 = i13;
                                                columnIndex17 = columnIndex17;
                                            }
                                        }
                                        str2 = str3;
                                        i3 = columnIndex16;
                                        i4 = columnIndex17;
                                        Collection values = treeMap.values();
                                        h.e(values, "columnsMap.values");
                                        List X3 = AbstractC0961m.X(values);
                                        Collection values2 = treeMap2.values();
                                        h.e(values2, "ordersMap.values");
                                        dVar = new d(string9, z4, X3, AbstractC0961m.X(values2));
                                        AbstractC0949a.h(j3, null);
                                        th = null;
                                    }
                                    if (dVar == null) {
                                        AbstractC0949a.h(j3, th);
                                        c1002h2 = null;
                                        break;
                                    }
                                    c1002h4.add(dVar);
                                    c1380b2 = c1380b;
                                    str7 = str8;
                                    columnIndex15 = i2;
                                    str3 = str2;
                                    columnIndex16 = i3;
                                    columnIndex17 = i4;
                                } finally {
                                }
                            }
                        }
                        c1002h = AbstractC0948C.f(c1002h4);
                        AbstractC0949a.h(j3, null);
                    }
                    c1002h2 = c1002h;
                    return new e(str, map, f3, c1002h2);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!h.a(this.f10662a, eVar.f10662a) || !h.a(this.f10663b, eVar.f10663b) || !h.a(this.f10664c, eVar.f10664c)) {
            return false;
        }
        Set set2 = this.f10665d;
        if (set2 == null || (set = eVar.f10665d) == null) {
            return true;
        }
        return h.a(set2, set);
    }

    public final int hashCode() {
        return this.f10664c.hashCode() + ((this.f10663b.hashCode() + (this.f10662a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f10662a + "', columns=" + this.f10663b + ", foreignKeys=" + this.f10664c + ", indices=" + this.f10665d + '}';
    }
}
