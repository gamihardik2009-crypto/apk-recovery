package androidx.work;

import B1.s;
import java.util.Collections;
import java.util.List;
import y1.InterfaceC1400b;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC1400b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6935a = s.f("WrkMgrInitializer");

    @Override // y1.InterfaceC1400b
    public final List a() {
        return Collections.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r2 = r5.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (C1.w.q != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        C1.w.q = C1.y.p(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        C1.w.f686p = C1.w.q;
     */
    @Override // y1.InterfaceC1400b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r5) {
        /*
            r4 = this;
            B1.s r0 = B1.s.d()
            java.lang.String r1 = androidx.work.WorkManagerInitializer.f6935a
            java.lang.String r2 = "Initializing WorkManager with default configuration."
            r0.a(r1, r2)
            B1.u r0 = new B1.u
            r0.<init>()
            B1.a r1 = new B1.a
            r1.<init>(r0)
            java.lang.Object r0 = C1.w.f687r
            monitor-enter(r0)
            C1.w r2 = C1.w.f686p     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            C1.w r3 = C1.w.q     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L21
            goto L2b
        L21:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L29
            throw r5     // Catch: java.lang.Throwable -> L29
        L29:
            r5 = move-exception
            goto L45
        L2b:
            if (r2 != 0) goto L3f
            android.content.Context r2 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L29
            C1.w r3 = C1.w.q     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L3b
            C1.w r1 = C1.y.p(r2, r1)     // Catch: java.lang.Throwable -> L29
            C1.w.q = r1     // Catch: java.lang.Throwable -> L29
        L3b:
            C1.w r1 = C1.w.q     // Catch: java.lang.Throwable -> L29
            C1.w.f686p = r1     // Catch: java.lang.Throwable -> L29
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            C1.w r5 = C1.w.o0(r5)
            return r5
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkManagerInitializer.b(android.content.Context):java.lang.Object");
    }
}
