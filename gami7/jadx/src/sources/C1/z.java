package C1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b.AbstractActivityC0489m;
import b.C0482f;
import b.C0499w;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l2.InterfaceFutureC0816a;
import q1.AbstractC1065g;
import q1.RunnableC1063e;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f704h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f705i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f706j;

    public /* synthetic */ z(Object obj, int i2, Object obj2) {
        this.f704h = i2;
        this.f705i = obj;
        this.f706j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f704h) {
            case 0:
                A a3 = (A) this.f705i;
                InterfaceFutureC0816a interfaceFutureC0816a = (InterfaceFutureC0816a) this.f706j;
                if (a3.f617w.f4781a instanceof M1.a) {
                    interfaceFutureC0816a.cancel(true);
                    return;
                }
                return;
            case 1:
                D1.d dVar = (D1.d) this.f705i;
                z2.h.f(dVar, "this$0");
                o oVar = (o) this.f706j;
                z2.h.f(oVar, "$token");
                dVar.f1011b.g(oVar, 3);
                return;
            case 2:
                List list = (List) this.f705i;
                z2.h.f(list, "$listenersList");
                I1.f fVar = (I1.f) this.f706j;
                z2.h.f(fVar, "this$0");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((H1.b) it.next()).a(fVar.f3946e);
                }
                return;
            case 3:
                L1.t tVar = (L1.t) this.f705i;
                M1.k kVar = (M1.k) this.f706j;
                if (tVar.f4668h.f4781a instanceof M1.a) {
                    kVar.cancel(true);
                    return;
                } else {
                    kVar.l(tVar.f4671k.b());
                    return;
                }
            case 4:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f705i;
                InterfaceFutureC0816a interfaceFutureC0816a2 = (InterfaceFutureC0816a) this.f706j;
                z2.h.f(constraintTrackingWorker, "this$0");
                z2.h.f(interfaceFutureC0816a2, "$innerFuture");
                synchronized (constraintTrackingWorker.f6966m) {
                    try {
                        if (constraintTrackingWorker.f6967n) {
                            M1.k kVar2 = constraintTrackingWorker.f6968o;
                            z2.h.e(kVar2, "future");
                            String str = O1.a.f5157a;
                            kVar2.j(new B1.o());
                        } else {
                            constraintTrackingWorker.f6968o.l(interfaceFutureC0816a2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case AbstractC1166e.f10138f /* 5 */:
                X.a.a((X.c) this.f705i, (LongSparseArray) this.f706j);
                return;
            case AbstractC1166e.f10136d /* 6 */:
                AbstractActivityC0489m abstractActivityC0489m = (AbstractActivityC0489m) this.f705i;
                z2.h.f(abstractActivityC0489m, "this$0");
                C0499w c0499w = (C0499w) this.f706j;
                z2.h.f(c0499w, "$dispatcher");
                int i2 = AbstractActivityC0489m.f7000z;
                abstractActivityC0489m.f7001h.a(new C0482f(c0499w, abstractActivityC0489m));
                return;
            case 7:
                ((ProfileInstallerInitializer) this.f705i).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC1065g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1063e((Context) this.f706j, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable = (Runnable) this.f705i;
                z2.h.f(runnable, "$command");
                L1.o oVar2 = (L1.o) this.f706j;
                z2.h.f(oVar2, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    oVar2.a();
                }
        }
    }
}
