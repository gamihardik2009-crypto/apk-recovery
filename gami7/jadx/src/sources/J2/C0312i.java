package J2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: J2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312i extends C0319p {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4408c = AtomicIntegerFieldUpdater.newUpdater(C0312i.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0312i(q2.InterfaceC1073d r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1a:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.C0312i.<init>(q2.d, java.lang.Throwable, boolean):void");
    }
}
