package M1;

import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final i f4772h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceFutureC0816a f4773i;

    public f(i iVar, InterfaceFutureC0816a interfaceFutureC0816a) {
        this.f4772h = iVar;
        this.f4773i = interfaceFutureC0816a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4772h.f4781a != this) {
            return;
        }
        if (i.f4779f.B(this.f4772h, this, i.f(this.f4773i))) {
            i.c(this.f4772h);
        }
    }
}
