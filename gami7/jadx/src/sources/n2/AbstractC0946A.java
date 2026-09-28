package n2;

import D.c0;
import H.C0157n1;
import H.K0;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0258c0;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import m2.C0865g;
import m2.C0880v;
import n0.C0921D;
import n1.C0941b;
import n1.C0945f;
import o2.C0996b;
import p.W;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import u0.AbstractC1323z0;
import v.C1354h;
import w1.C1380b;

/* renamed from: n2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0946A {

    /* renamed from: a, reason: collision with root package name */
    public static long f9151a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f9152b;

    public static final void a(o1.o oVar, C0285q c0285q, int i2) {
        T.r rVar;
        c0285q.W(294589392);
        int i3 = 4;
        int i4 = (i2 & 6) == 0 ? (c0285q.g(oVar) ? 4 : 2) | i2 : i2;
        if ((i4 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            S.h L3 = l0.c.L(c0285q);
            InterfaceC0258c0 w2 = C0257c.w(oVar.b().f9048e, c0285q);
            List list = (List) w2.getValue();
            boolean booleanValue = ((Boolean) c0285q.l(AbstractC1323z0.f11257a)).booleanValue();
            boolean g3 = c0285q.g(list);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            Object obj2 = K3;
            if (g3 || K3 == obj) {
                T.r rVar2 = new T.r();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    C0945f c0945f = (C0945f) obj3;
                    if (booleanValue || c0945f.f9034o.f6909c.compareTo(EnumC0466o.f6901k) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                rVar2.addAll(arrayList);
                c0285q.e0(rVar2);
                obj2 = rVar2;
            }
            T.r rVar3 = (T.r) obj2;
            b(rVar3, (List) w2.getValue(), c0285q, 0);
            InterfaceC0258c0 w3 = C0257c.w(oVar.b().f9049f, c0285q);
            Object K4 = c0285q.K();
            if (K4 == obj) {
                K4 = new T.r();
                c0285q.e0(K4);
            }
            T.r rVar4 = (T.r) K4;
            c0285q.U(1361037007);
            ListIterator listIterator = rVar3.listIterator();
            while (true) {
                T.x xVar = (T.x) listIterator;
                if (!xVar.hasNext()) {
                    break;
                }
                C0945f c0945f2 = (C0945f) xVar.next();
                n1.s sVar = c0945f2.f9028i;
                z2.h.d(sVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                o1.n nVar = (o1.n) sVar;
                boolean i5 = c0285q.i(c0945f2) | ((i4 & 14) == i3);
                Object K5 = c0285q.K();
                if (i5 || K5 == obj) {
                    K5 = new c0(oVar, 10, c0945f2);
                    c0285q.e0(K5);
                }
                C1.y.b((y2.a) K5, nVar.q, R.b.c(1129586364, new K0(c0945f2, oVar, L3, rVar4, nVar, 2), c0285q), c0285q, 384, 0);
                rVar4 = rVar4;
                i3 = 4;
            }
            T.r rVar5 = rVar4;
            c0285q.r(false);
            Set set = (Set) w3.getValue();
            boolean g4 = c0285q.g(w3) | ((i4 & 14) == 4);
            Object K6 = c0285q.K();
            if (g4 || K6 == obj) {
                rVar = rVar5;
                K6 = new o1.k(w3, oVar, rVar, null);
                c0285q.e0(K6);
            } else {
                rVar = rVar5;
            }
            C0257c.f(set, rVar, (y2.e) K6, c0285q);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new R0.q(i2, 2, oVar);
        }
    }

    public static final void b(List list, Collection collection, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(1537894851);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(collection) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            boolean booleanValue = ((Boolean) c0285q.l(AbstractC1323z0.f11257a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C0945f c0945f = (C0945f) it.next();
                C0472v c0472v = c0945f.f9034o;
                boolean h2 = c0285q.h(booleanValue) | c0285q.i(list) | c0285q.i(c0945f);
                Object K3 = c0285q.K();
                if (h2 || K3 == C0275l.f4150a) {
                    K3 = new o1.m(list, c0945f, booleanValue);
                    c0285q.e0(K3);
                }
                C0257c.d(c0472v, (y2.c) K3, c0285q);
            }
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 9, list, collection);
        }
    }

    public static final int c(int i2, L.d dVar) {
        int i3 = dVar.f4620j - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = dVar.f4618h;
            int i6 = ((C1354h) objArr[i5]).f11345a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((C1354h) objArr[i4]).f11345a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if ((!r8) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(n0.C0918A r7, q2.InterfaceC1073d r8) {
        /*
            boolean r0 = r8 instanceof p.V
            if (r0 == 0) goto L13
            r0 = r8
            p.V r0 = (p.V) r0
            int r1 = r0.f9511m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9511m = r1
            goto L18
        L13:
            p.V r0 = new p.V
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9510l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9511m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            n0.A r7 = r0.f9509k
            C1.y.J(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            C1.y.J(r8)
            n0.D r8 = r7.f8905l
            n0.i r8 = r8.f8919z
            java.util.List r8 = r8.f8943a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L51
            java.lang.Object r6 = r8.get(r5)
            n0.r r6 = (n0.r) r6
            boolean r6 = r6.f8960d
            if (r6 == 0) goto L4e
            r8 = r3
            goto L52
        L4e:
            int r5 = r5 + 1
            goto L40
        L51:
            r8 = r4
        L52:
            r8 = r8 ^ r3
            if (r8 != 0) goto L7b
        L55:
            n0.j r8 = n0.EnumC0931j.f8948j
            r0.f9509k = r7
            r0.f9511m = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            n0.i r8 = (n0.C0930i) r8
            java.util.List r8 = r8.f8943a
            int r2 = r8.size()
            r5 = r4
        L6b:
            if (r5 >= r2) goto L7b
            java.lang.Object r6 = r8.get(r5)
            n0.r r6 = (n0.r) r6
            boolean r6 = r6.f8960d
            if (r6 == 0) goto L78
            goto L55
        L78:
            int r5 = r5 + 1
            goto L6b
        L7b:
            m2.v r7 = m2.C0880v.f8657a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0946A.d(n0.A, q2.d):java.lang.Object");
    }

    public static final Object e(C0921D c0921d, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        Object K02 = c0921d.K0(new W(interfaceC1073d.n(), eVar, null), interfaceC1073d);
        return K02 == EnumC1145a.f10026h ? K02 : C0880v.f8657a;
    }

    public static void f(v1.d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            if (obj == null) {
                dVar.n(i2);
            } else if (obj instanceof byte[]) {
                dVar.m(i2, (byte[]) obj);
            } else if (obj instanceof Float) {
                dVar.k(((Number) obj).floatValue(), i2);
            } else if (obj instanceof Double) {
                dVar.k(((Number) obj).doubleValue(), i2);
            } else if (obj instanceof Long) {
                dVar.t(((Number) obj).longValue(), i2);
            } else if (obj instanceof Integer) {
                dVar.t(((Number) obj).intValue(), i2);
            } else if (obj instanceof Short) {
                dVar.t(((Number) obj).shortValue(), i2);
            } else if (obj instanceof Byte) {
                dVar.t(((Number) obj).byteValue(), i2);
            } else if (obj instanceof String) {
                dVar.p((String) obj, i2);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                dVar.t(((Boolean) obj).booleanValue() ? 1L : 0L, i2);
            }
        }
    }

    public static final r1.q g(Context context, Class cls, String str) {
        if (!H2.l.V(str)) {
            return new r1.q(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final void h(C1380b c1380b) {
        C0996b c0996b = new C0996b(10);
        Cursor j3 = c1380b.j("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (j3.moveToNext()) {
            try {
                c0996b.add(j3.getString(0));
            } finally {
            }
        }
        AbstractC0949a.h(j3, null);
        ListIterator listIterator = AbstractC0962n.e(c0996b).listIterator(0);
        while (true) {
            T.x xVar = (T.x) listIterator;
            if (!xVar.hasNext()) {
                return;
            }
            String str = (String) xVar.next();
            z2.h.e(str, "triggerName");
            if (str.startsWith("room_fts_content_sync_")) {
                c1380b.e("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final int i(int i2, Object obj, v.x xVar) {
        int c3;
        return (obj == null || xVar.a() == 0 || (i2 < xVar.a() && z2.h.a(obj, xVar.b(i2))) || (c3 = xVar.c(obj)) == -1) ? i2 : c3;
    }

    public static n1.s j(n1.v vVar) {
        Iterator it = G2.i.i0(vVar, C0941b.f9022p).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (n1.s) next;
    }

    public static Object k(Map map, Object obj) {
        z2.h.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static boolean l() {
        boolean isEnabled;
        try {
            if (f9152b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f9152b == null) {
                f9151a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9152b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9152b.invoke(null, Long.valueOf(f9151a))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int m(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map n(C0865g... c0865gArr) {
        if (c0865gArr.length <= 0) {
            return C0971w.f9166h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m(c0865gArr.length));
        o(linkedHashMap, c0865gArr);
        return linkedHashMap;
    }

    public static final void o(HashMap hashMap, C0865g[] c0865gArr) {
        for (C0865g c0865g : c0865gArr) {
            hashMap.put(c0865g.f8646h, c0865g.f8647i);
        }
    }

    public static final Cursor p(r1.r rVar, r1.v vVar, boolean z3) {
        z2.h.f(rVar, "db");
        z2.h.f(vVar, "sqLiteQuery");
        Cursor m3 = rVar.m(vVar, null);
        if (z3 && (m3 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) m3;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                z2.h.f(m3, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(m3.getColumnNames(), m3.getCount());
                    while (m3.moveToNext()) {
                        Object[] objArr = new Object[m3.getColumnCount()];
                        int columnCount = m3.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = m3.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(m3.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(m3.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = m3.getString(i2);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i2] = m3.getBlob(i2);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    AbstractC0949a.h(m3, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return m3;
    }

    public static final void q(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void r(String str) {
        throw new IllegalStateException(str);
    }

    public static final void s(String str) {
        throw new IllegalStateException(str);
    }

    public static Map t(ArrayList arrayList) {
        C0971w c0971w = C0971w.f9166h;
        int size = arrayList.size();
        if (size == 0) {
            return c0971w;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(m(arrayList.size()));
            v(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        C0865g c0865g = (C0865g) arrayList.get(0);
        z2.h.f(c0865g, "pair");
        Map singletonMap = Collections.singletonMap(c0865g.f8646h, c0865g.f8647i);
        z2.h.e(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map u(LinkedHashMap linkedHashMap) {
        z2.h.f(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : w(linkedHashMap) : C0971w.f9166h;
    }

    public static final void v(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0865g c0865g = (C0865g) it.next();
            linkedHashMap.put(c0865g.f8646h, c0865g.f8647i);
        }
    }

    public static final Map w(LinkedHashMap linkedHashMap) {
        z2.h.f(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        z2.h.e(singletonMap, "with(...)");
        return singletonMap;
    }
}
