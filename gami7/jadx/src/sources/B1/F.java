package B1;

import J2.AbstractC0324v;
import J2.InterfaceC0310g;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.work.Worker;
import b1.C0507D;
import b1.C0549z;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import l2.InterfaceFutureC0816a;
import m2.C0880v;
import q2.C1079j;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class F implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f256h;

    /* renamed from: i, reason: collision with root package name */
    public Object f257i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f258j;

    public /* synthetic */ F(int i2, Object obj, Object obj2, boolean z3) {
        this.f256h = i2;
        this.f257i = obj;
        this.f258j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K1.o oVar;
        switch (this.f256h) {
            case 0:
                try {
                    ((Worker) this.f258j).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th) {
                    ((M1.k) this.f257i).k(th);
                    return;
                }
            case 1:
                if (((C1.A) this.f258j).f617w.f4781a instanceof M1.a) {
                    return;
                }
                try {
                    ((InterfaceFutureC0816a) this.f257i).get();
                    s.d().a(C1.A.f602y, "Starting work for " + ((C1.A) this.f258j).f605j.f4566c);
                    C1.A a3 = (C1.A) this.f258j;
                    a3.f617w.l(a3.f606k.d());
                    return;
                } catch (Throwable th2) {
                    ((C1.A) this.f258j).f617w.k(th2);
                    return;
                }
            case 2:
                String str = (String) this.f257i;
                C1.A a4 = (C1.A) this.f258j;
                try {
                    try {
                        q qVar = (q) a4.f617w.get();
                        if (qVar == null) {
                            s.d().b(C1.A.f602y, a4.f605j.f4566c + " returned a null result. Treating it as a failure.");
                        } else {
                            s.d().a(C1.A.f602y, a4.f605j.f4566c + " returned a " + qVar + ".");
                            a4.f608m = qVar;
                        }
                    } catch (Throwable th3) {
                        a4.b();
                        throw th3;
                    }
                } catch (InterruptedException e3) {
                    e = e3;
                    s.d().c(C1.A.f602y, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e4) {
                    s d3 = s.d();
                    String str2 = C1.A.f602y;
                    String str3 = str + " was cancelled";
                    if (d3.f307a <= 4) {
                        Log.i(str2, str3, e4);
                    }
                } catch (ExecutionException e5) {
                    e = e5;
                    s.d().c(C1.A.f602y, str + " failed because it threw an exception/error", e);
                }
                a4.b();
                return;
            case 3:
                s d4 = s.d();
                String str4 = D1.a.f989e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                K1.o oVar2 = (K1.o) this.f257i;
                sb.append(oVar2.f4564a);
                d4.a(str4, sb.toString());
                ((D1.a) this.f258j).f990a.c(oVar2);
                return;
            case 4:
                C1.i iVar = ((J1.c) this.f258j).f4326h.f693k;
                String str5 = (String) this.f257i;
                synchronized (iVar.f655k) {
                    try {
                        C1.A c3 = iVar.c(str5);
                        oVar = c3 != null ? c3.f605j : null;
                    } finally {
                    }
                }
                if (oVar == null || !oVar.b()) {
                    return;
                }
                synchronized (((J1.c) this.f258j).f4328j) {
                    ((J1.c) this.f258j).f4331m.put(C1.y.v(oVar), oVar);
                    J1.c cVar = (J1.c) this.f258j;
                    ((J1.c) this.f258j).f4332n.put(C1.y.v(oVar), G1.k.a(cVar.f4333o, oVar, cVar.f4327i.f5011b, cVar));
                }
                return;
            case AbstractC1166e.f10138f /* 5 */:
                ((InterfaceC0310g) this.f258j).D((AbstractC0324v) this.f257i);
                return;
            case AbstractC1166e.f10136d /* 6 */:
                ((InterfaceC0310g) this.f257i).D((K2.d) this.f258j);
                return;
            case 7:
                try {
                    ((Runnable) this.f258j).run();
                    synchronized (((L1.o) this.f257i).f4659l) {
                        ((L1.o) this.f257i).a();
                    }
                    return;
                } catch (Throwable th4) {
                    synchronized (((L1.o) this.f257i).f4659l) {
                        ((L1.o) this.f257i).a();
                        throw th4;
                    }
                }
            case 8:
                if (((L1.t) this.f258j).f4668h.f4781a instanceof M1.a) {
                    return;
                }
                try {
                    i iVar2 = (i) ((M1.k) this.f257i).get();
                    if (iVar2 == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((L1.t) this.f258j).f4670j.f4566c + ") but did not provide ForegroundInfo");
                    }
                    s.d().a(L1.t.f4667n, "Updating notification for " + ((L1.t) this.f258j).f4670j.f4566c);
                    L1.t tVar = (L1.t) this.f258j;
                    M1.k kVar = tVar.f4668h;
                    j jVar = tVar.f4672l;
                    Context context = tVar.f4669i;
                    UUID uuid = tVar.f4671k.f302i.f6937a;
                    L1.v vVar = (L1.v) jVar;
                    vVar.getClass();
                    M1.k kVar2 = new M1.k();
                    vVar.f4679a.a(new L1.u(vVar, kVar2, uuid, iVar2, context));
                    kVar.l(kVar2);
                    return;
                } catch (Throwable th5) {
                    ((L1.t) this.f258j).f4668h.k(th5);
                    return;
                }
            case AbstractC1166e.f10135c /* 9 */:
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f257i).run();
                    } catch (Throwable th6) {
                        J2.B.m(th6, C1079j.f9784h);
                    }
                    O2.i iVar3 = (O2.i) this.f258j;
                    Runnable x2 = iVar3.x();
                    if (x2 == null) {
                        return;
                    }
                    this.f257i = x2;
                    i2++;
                    if (i2 >= 16) {
                        AbstractC0324v abstractC0324v = iVar3.f5184j;
                        if (abstractC0324v.w()) {
                            abstractC0324v.r(iVar3, this);
                            return;
                        }
                    }
                }
            case AbstractC1166e.f10137e /* 10 */:
                ((R2.e) ((R2.f) this.f257i)).n((R2.b) this.f258j, C0880v.f8657a);
                return;
            default:
                C0549z.g((View) this.f257i);
                ((ValueAnimator) this.f258j).start();
                return;
        }
    }

    public /* synthetic */ F(Object obj, int i2, Object obj2) {
        this.f256h = i2;
        this.f258j = obj;
        this.f257i = obj2;
    }

    public F(View view, C0507D c0507d, K1.l lVar, ValueAnimator valueAnimator) {
        this.f256h = 11;
        this.f257i = view;
        this.f258j = valueAnimator;
    }
}
