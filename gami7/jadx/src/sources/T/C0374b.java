package T;

import J.Y;

/* renamed from: T.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374b extends C0375c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0374b(int r6, T.l r7) {
        /*
            r5 = this;
            java.lang.Object r0 = T.n.f5710b
            monitor-enter(r0)
            java.util.List r1 = T.n.f5716h     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "<this>"
            z2.h.f(r1, r2)     // Catch: java.lang.Throwable -> L24
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L24
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L18
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L24
            goto L19
        L18:
            r2 = r4
        L19:
            y2.c r2 = (y2.c) r2     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            D.O r2 = new D.O     // Catch: java.lang.Throwable -> L24
            r3 = 3
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r6 = move-exception
            goto L2b
        L26:
            monitor-exit(r0)
            r5.<init>(r6, r7, r4, r2)
            return
        L2b:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0374b.<init>(int, T.l):void");
    }

    @Override // T.C0375c
    public final C0375c B(y2.c cVar, y2.c cVar2) {
        return (C0375c) ((AbstractC0379g) n.f(new Y(2, new C0373a(cVar, cVar2, 0))));
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void c() {
        synchronized (n.f5710b) {
            int i2 = this.f5688d;
            if (i2 >= 0) {
                n.u(i2);
                this.f5688d = -1;
            }
        }
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void k() {
        s.g();
        throw null;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void l() {
        s.g();
        throw null;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void m() {
        n.a();
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final AbstractC0379g t(y2.c cVar) {
        return (AbstractC0379g) n.f(new Y(2, new Y(1, cVar)));
    }

    @Override // T.C0375c
    public final s v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
