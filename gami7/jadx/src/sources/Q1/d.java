package Q1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import m2.C0880v;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import r1.v;
import w1.C1387i;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5276c;

    public /* synthetic */ d(Object obj, int i2, Object obj2) {
        this.f5274a = i2;
        this.f5276c = obj;
        this.f5275b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r1.r rVar;
        switch (this.f5274a) {
            case 0:
                e eVar = (e) this.f5276c;
                K1.h hVar = (K1.h) eVar.f5281e;
                rVar = (r1.r) eVar.f5277a;
                C1387i a3 = hVar.a();
                a3.p((String) this.f5275b, 1);
                try {
                    rVar.c();
                    try {
                        a3.b();
                        rVar.o();
                        hVar.c(a3);
                        return C0880v.f8657a;
                    } finally {
                    }
                } catch (Throwable th) {
                    hVar.c(a3);
                    throw th;
                }
            case 1:
                k kVar = (k) this.f5276c;
                rVar = (r1.r) kVar.f5292a;
                rVar.c();
                try {
                    ((j) kVar.f5296e).e((R1.f) this.f5275b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            case 2:
                m mVar = (m) this.f5276c;
                rVar = (r1.r) mVar.f5302a;
                rVar.c();
                try {
                    ((K1.b) mVar.f5303b).g((R1.a) this.f5275b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            default:
                Cursor p3 = AbstractC0946A.p((r1.r) ((r) this.f5276c).f5322b, (v) this.f5275b, false);
                try {
                    int j3 = AbstractC0962n.j(p3, "id");
                    int j4 = AbstractC0962n.j(p3, "title");
                    int j5 = AbstractC0962n.j(p3, "greeting");
                    int j6 = AbstractC0962n.j(p3, "message");
                    int j7 = AbstractC0962n.j(p3, "enabled");
                    int j8 = AbstractC0962n.j(p3, "order");
                    ArrayList arrayList = new ArrayList(p3.getCount());
                    while (p3.moveToNext()) {
                        arrayList.add(new R1.e(p3.getString(j3), p3.getString(j4), p3.getString(j5), p3.getString(j6), p3.getInt(j7) != 0, p3.getInt(j8)));
                    }
                    return arrayList;
                } finally {
                    p3.close();
                }
        }
    }

    public void finalize() {
        switch (this.f5274a) {
            case 3:
                ((v) this.f5275b).c();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
