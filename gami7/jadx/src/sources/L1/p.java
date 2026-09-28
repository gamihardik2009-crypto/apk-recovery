package L1;

import C1.A;
import java.util.Set;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final C1.i f4660h;

    /* renamed from: i, reason: collision with root package name */
    public final C1.o f4661i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4662j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4663k;

    public p(C1.i iVar, C1.o oVar, boolean z3, int i2) {
        z2.h.f(iVar, "processor");
        z2.h.f(oVar, "token");
        this.f4660h = iVar;
        this.f4661i = oVar;
        this.f4662j = z3;
        this.f4663k = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d3;
        A b3;
        if (this.f4662j) {
            C1.i iVar = this.f4660h;
            C1.o oVar = this.f4661i;
            int i2 = this.f4663k;
            iVar.getClass();
            String str = oVar.f667a.f4551a;
            synchronized (iVar.f655k) {
                b3 = iVar.b(str);
            }
            d3 = C1.i.d(str, b3, i2);
        } else {
            C1.i iVar2 = this.f4660h;
            C1.o oVar2 = this.f4661i;
            int i3 = this.f4663k;
            iVar2.getClass();
            String str2 = oVar2.f667a.f4551a;
            synchronized (iVar2.f655k) {
                try {
                    if (iVar2.f650f.get(str2) != null) {
                        B1.s.d().a(C1.i.f644l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) iVar2.f652h.get(str2);
                        if (set != null && set.contains(oVar2)) {
                            d3 = C1.i.d(str2, iVar2.b(str2), i3);
                        }
                    }
                    d3 = false;
                } finally {
                }
            }
        }
        B1.s.d().a(B1.s.f("StopWorkRunnable"), "StopWorkRunnable for " + this.f4661i.f667a.f4551a + "; Processor.stopWork = " + d3);
    }
}
