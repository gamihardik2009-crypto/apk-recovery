package p1;

import C1.b;
import C1.u;
import H2.l;
import O.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n2.AbstractC0946A;
import n2.AbstractC0949a;
import n2.C0970v;
import o2.C0997c;
import p.C1028l0;
import r1.C1144g;
import u.C1271b;
import u.f;
import u.t;
import v.C1354h;
import w1.C1380b;
import z2.h;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058a {

    /* renamed from: a, reason: collision with root package name */
    public int f9731a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9732b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9733c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9734d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9735e;

    public C1058a(T2.a aVar, LinkedHashMap linkedHashMap) {
        this.f9732b = aVar;
        this.f9733c = linkedHashMap;
        this.f9734d = X2.a.f6231a;
        this.f9735e = new LinkedHashMap();
        this.f9731a = -1;
    }

    public static void a(String str) {
        if (l.P(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            boolean z4 = h.g(str.charAt(!z3 ? i2 : length), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length--;
                }
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        if (str.subSequence(i2, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e3) {
            Log.w("SupportSQLite", "delete failed: ", e3);
        }
    }

    public int A(int i2) {
        t tVar = t.f10783a;
        C1354h e3 = ((u.h) this.f9732b).f10692b.e(i2);
        return (int) ((C1271b) ((f) e3.f11347c).f10685b.j(tVar, Integer.valueOf(i2 - e3.f11345a))).f10667a;
    }

    public void B(C1380b c1380b) {
        c1380b.e("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) this.f9734d;
        h.f(str, "hash");
        c1380b.e("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    public void b(boolean z3) {
        p(Boolean.valueOf(z3));
    }

    public void c(byte b3) {
        p(Byte.valueOf(b3));
    }

    public void d(char c3) {
        p(Character.valueOf(c3));
    }

    public void e(double d3) {
        p(Double.valueOf(d3));
    }

    public void f(U2.f fVar, int i2) {
        h.f(fVar, "descriptor");
        this.f9731a = i2;
    }

    public void g(U2.f fVar, int i2) {
        h.f(fVar, "enumDescriptor");
        p(Integer.valueOf(i2));
    }

    public void h(float f3) {
        p(Float.valueOf(f3));
    }

    public void i(int i2) {
        p(Integer.valueOf(i2));
    }

    public void j(long j3) {
        p(Long.valueOf(j3));
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void k(T2.a aVar, Object obj) {
        h.f(aVar, "serializer");
        aVar.a(this, obj);
    }

    public void m(short s3) {
        p(Short.valueOf(s3));
    }

    public void n(String str) {
        h.f(str, "value");
        p(str);
    }

    public void o(Object obj) {
        h.f(obj, "value");
        k((T2.a) this.f9732b, obj);
        AbstractC0946A.u((LinkedHashMap) this.f9735e);
    }

    public void p(Object obj) {
        h.f(obj, "value");
        u();
        throw null;
    }

    public m q(int i2) {
        List list;
        ((u.h) this.f9732b).getClass();
        int i3 = this.f9731a;
        int i4 = i2 * i3;
        int t3 = t() - i4;
        if (i3 > t3) {
            i3 = t3;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 == ((List) this.f9735e).size()) {
            list = (List) this.f9735e;
        } else {
            ArrayList arrayList = new ArrayList(i3);
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(new C1271b(1));
            }
            this.f9735e = arrayList;
            list = arrayList;
        }
        return new m(i4, list);
    }

    public int r(int i2) {
        if (t() <= 0) {
            return 0;
        }
        if (i2 >= t()) {
            throw new IllegalArgumentException("ItemIndex > total count".toString());
        }
        ((u.h) this.f9732b).getClass();
        return i2 / this.f9731a;
    }

    public b s() {
        return (b) this.f9734d;
    }

    public int t() {
        return ((u.h) this.f9732b).f10692b.f865a;
    }

    public void u() {
        String a3 = ((T2.a) this.f9732b).b().a(this.f9731a);
        B1.t.w(((Map) this.f9733c).get(a3));
        throw new IllegalStateException(("Cannot find NavType for argument " + a3 + ". Please provide NavType through typeMap.").toString());
    }

    public void v(C1380b c1380b) {
    }

    public void w(C1380b c1380b) {
        Cursor j3 = c1380b.j("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (j3.moveToFirst()) {
                if (j3.getInt(0) == 0) {
                    z3 = true;
                }
            }
            AbstractC0949a.h(j3, null);
            u uVar = (u) this.f9733c;
            uVar.a(c1380b);
            if (!z3) {
                C1028l0 f3 = uVar.f(c1380b);
                if (!f3.f9636h) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) f3.f9637i));
                }
            }
            B(c1380b);
            uVar.c(c1380b);
        } finally {
        }
    }

    public void x(C1380b c1380b, int i2, int i3) {
        z(c1380b, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(w1.C1380b r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.j(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto L9f
        L18:
            r1 = r2
        L19:
            r3 = 0
            n2.AbstractC0949a.h(r0, r3)
            java.lang.Object r0 = r5.f9733c
            C1.u r0 = (C1.u) r0
            if (r1 == 0) goto L76
            O2.v r1 = new O2.v
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.l(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L3b
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r6 = move-exception
            goto L70
        L3b:
            r2 = r3
        L3c:
            n2.AbstractC0949a.h(r1, r3)
            java.lang.Object r1 = r5.f9734d
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = z2.h.a(r1, r2)
            if (r4 != 0) goto L81
            java.lang.Object r4 = r5.f9735e
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = z2.h.a(r4, r2)
            if (r4 == 0) goto L54
            goto L81
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = ", found: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L70:
            throw r6     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            n2.AbstractC0949a.h(r1, r6)
            throw r0
        L76:
            p.l0 r1 = r0.f(r6)
            boolean r2 = r1.f9636h
            if (r2 == 0) goto L87
            r5.B(r6)
        L81:
            r0.d(r6)
            r5.f9732b = r3
            return
        L87:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.Object r1 = r1.f9637i
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L9f:
            throw r6     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            n2.AbstractC0949a.h(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1058a.y(w1.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0041 A[EDGE_INSN: B:61:0x0041->B:44:0x0041 BREAK  A[LOOP:1: B:23:0x0029->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(w1.C1380b r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1058a.z(w1.b, int, int):void");
    }

    public C1058a(u.h hVar) {
        this.f9732b = hVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0997c(0, 0));
        this.f9733c = arrayList;
        this.f9734d = new ArrayList();
        this.f9735e = C0970v.f9165h;
    }

    public C1058a(C1144g c1144g, u uVar, String str, String str2) {
        this.f9731a = uVar.f683a;
        this.f9732b = c1144g;
        this.f9733c = uVar;
        this.f9734d = str;
        this.f9735e = str2;
    }
}
