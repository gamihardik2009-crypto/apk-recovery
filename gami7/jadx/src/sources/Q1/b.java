package Q1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import m2.C0880v;
import n2.AbstractC0948C;
import w1.C1387i;

/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f5270c;

    public /* synthetic */ b(e eVar, List list, int i2) {
        this.f5268a = i2;
        this.f5270c = eVar;
        this.f5269b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r1.r rVar;
        switch (this.f5268a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM clients WHERE id IN (");
                List list = this.f5269b;
                AbstractC0948C.e(sb, list.size());
                sb.append(")");
                String sb2 = sb.toString();
                e eVar = this.f5270c;
                r1.r rVar2 = (r1.r) eVar.f5277a;
                rVar2.getClass();
                z2.h.f(sb2, "sql");
                rVar2.a();
                rVar2.b();
                C1387i c3 = rVar2.g().q().c(sb2);
                Iterator it = list.iterator();
                int i2 = 1;
                while (it.hasNext()) {
                    c3.p((String) it.next(), i2);
                    i2++;
                }
                rVar = (r1.r) eVar.f5277a;
                rVar.c();
                try {
                    c3.b();
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            default:
                e eVar2 = this.f5270c;
                rVar = (r1.r) eVar2.f5277a;
                rVar.c();
                try {
                    ((K1.b) eVar2.f5278b).h(this.f5269b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
        }
    }
}
