package C1;

import B.F;
import a.AbstractC0423a;
import android.content.Context;
import g1.C0689k;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f637h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f639j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f640k;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i2) {
        this.f637h = i2;
        this.f638i = obj;
        this.f639j = obj2;
        this.f640k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        switch (this.f637h) {
            case 0:
                i iVar = (i) this.f638i;
                InterfaceFutureC0816a interfaceFutureC0816a = (InterfaceFutureC0816a) this.f639j;
                A a3 = (A) this.f640k;
                iVar.getClass();
                try {
                    z3 = ((Boolean) interfaceFutureC0816a.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z3 = true;
                }
                synchronized (iVar.f655k) {
                    try {
                        K1.j v3 = y.v(a3.f605j);
                        String str = v3.f4551a;
                        if (iVar.c(str) == a3) {
                            iVar.b(str);
                        }
                        B1.s.d().a(i.f644l, i.class.getSimpleName() + " " + str + " executed; reschedule = " + z3);
                        Iterator it = iVar.f654j.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).e(v3, z3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                F f3 = (F) this.f638i;
                l0.c cVar = (l0.c) this.f639j;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f640k;
                f3.getClass();
                try {
                    g1.r E = AbstractC0423a.E((Context) f3.f165i);
                    if (E == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    g1.q qVar = (g1.q) E.f7753a;
                    synchronized (qVar.f7747k) {
                        qVar.f7749m = threadPoolExecutor;
                    }
                    E.f7753a.c(new C0689k(cVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    cVar.H(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
