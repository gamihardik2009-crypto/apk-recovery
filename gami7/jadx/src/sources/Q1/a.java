package Q1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import r1.v;

/* loaded from: classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f5266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f5267c;

    public /* synthetic */ a(e eVar, v vVar, int i2) {
        this.f5265a = i2;
        this.f5267c = eVar;
        this.f5266b = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor p3;
        Cursor p4;
        R1.b bVar;
        switch (this.f5265a) {
            case 0:
                p3 = AbstractC0946A.p((r1.r) this.f5267c.f5277a, this.f5266b, false);
                try {
                    int j3 = AbstractC0962n.j(p3, "id");
                    int j4 = AbstractC0962n.j(p3, "name");
                    int j5 = AbstractC0962n.j(p3, "phone");
                    int j6 = AbstractC0962n.j(p3, "notes");
                    int j7 = AbstractC0962n.j(p3, "active");
                    int j8 = AbstractC0962n.j(p3, "orderIndex");
                    int j9 = AbstractC0962n.j(p3, "useNameInTemplate");
                    int j10 = AbstractC0962n.j(p3, "source");
                    ArrayList arrayList = new ArrayList(p3.getCount());
                    while (p3.moveToNext()) {
                        arrayList.add(new R1.b(p3.getString(j3), p3.getString(j4), p3.getString(j5), p3.getString(j6), p3.getInt(j7) != 0, p3.getInt(j8), p3.getInt(j9) != 0, p3.getString(j10)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                p3 = AbstractC0946A.p((r1.r) this.f5267c.f5277a, this.f5266b, false);
                try {
                    int j11 = AbstractC0962n.j(p3, "id");
                    int j12 = AbstractC0962n.j(p3, "name");
                    int j13 = AbstractC0962n.j(p3, "phone");
                    int j14 = AbstractC0962n.j(p3, "notes");
                    int j15 = AbstractC0962n.j(p3, "active");
                    int j16 = AbstractC0962n.j(p3, "orderIndex");
                    int j17 = AbstractC0962n.j(p3, "useNameInTemplate");
                    int j18 = AbstractC0962n.j(p3, "source");
                    ArrayList arrayList2 = new ArrayList(p3.getCount());
                    while (p3.moveToNext()) {
                        arrayList2.add(new R1.b(p3.getString(j11), p3.getString(j12), p3.getString(j13), p3.getString(j14), p3.getInt(j15) != 0, p3.getInt(j16), p3.getInt(j17) != 0, p3.getString(j18)));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                p4 = AbstractC0946A.p((r1.r) this.f5267c.f5277a, this.f5266b, false);
                try {
                    int j19 = AbstractC0962n.j(p4, "id");
                    int j20 = AbstractC0962n.j(p4, "name");
                    int j21 = AbstractC0962n.j(p4, "phone");
                    int j22 = AbstractC0962n.j(p4, "notes");
                    int j23 = AbstractC0962n.j(p4, "active");
                    int j24 = AbstractC0962n.j(p4, "orderIndex");
                    int j25 = AbstractC0962n.j(p4, "useNameInTemplate");
                    int j26 = AbstractC0962n.j(p4, "source");
                    ArrayList arrayList3 = new ArrayList(p4.getCount());
                    while (p4.moveToNext()) {
                        arrayList3.add(new R1.b(p4.getString(j19), p4.getString(j20), p4.getString(j21), p4.getString(j22), p4.getInt(j23) != 0, p4.getInt(j24), p4.getInt(j25) != 0, p4.getString(j26)));
                    }
                    return arrayList3;
                } finally {
                }
            case 3:
                p4 = AbstractC0946A.p((r1.r) this.f5267c.f5277a, this.f5266b, false);
                try {
                    int j27 = AbstractC0962n.j(p4, "id");
                    int j28 = AbstractC0962n.j(p4, "name");
                    int j29 = AbstractC0962n.j(p4, "phone");
                    int j30 = AbstractC0962n.j(p4, "notes");
                    int j31 = AbstractC0962n.j(p4, "active");
                    int j32 = AbstractC0962n.j(p4, "orderIndex");
                    int j33 = AbstractC0962n.j(p4, "useNameInTemplate");
                    int j34 = AbstractC0962n.j(p4, "source");
                    if (p4.moveToFirst()) {
                        bVar = new R1.b(p4.getString(j27), p4.getString(j28), p4.getString(j29), p4.getString(j30), p4.getInt(j31) != 0, p4.getInt(j32), p4.getInt(j33) != 0, p4.getString(j34));
                    } else {
                        bVar = null;
                    }
                    return bVar;
                } finally {
                }
            default:
                p4 = AbstractC0946A.p((r1.r) this.f5267c.f5277a, this.f5266b, false);
                try {
                    return p4.moveToFirst() ? Integer.valueOf(p4.getInt(0)) : 0;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    public void finalize() {
        switch (this.f5265a) {
            case 0:
                this.f5266b.c();
                break;
            case 1:
                this.f5266b.c();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
