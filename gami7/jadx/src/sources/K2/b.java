package K2;

import J2.C0325w;
import J2.InterfaceC0326x;
import q2.AbstractC1070a;

/* loaded from: classes.dex */
public final class b extends AbstractC1070a implements InterfaceC0326x {
    private volatile Object _preHandler;

    public b() {
        super(C0325w.f4436h);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r4.getModifiers()) != false) goto L13;
     */
    @Override // J2.InterfaceC0326x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.Throwable r3, q2.InterfaceC1078i r4) {
        /*
            r2 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r4 >= r0) goto L46
            java.lang.Object r4 = r2._preHandler
            r0 = 0
            if (r4 == r2) goto Le
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            goto L2e
        Le:
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L2b
            int r1 = r4.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            int r1 = r4.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r4 = r0
        L2c:
            r2._preHandler = r4
        L2e:
            if (r4 == 0) goto L35
            java.lang.Object r4 = r4.invoke(r0, r0)
            goto L36
        L35:
            r4 = r0
        L36:
            boolean r1 = r4 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L3d
            r0 = r4
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L3d:
            if (r0 == 0) goto L46
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r0.uncaughtException(r4, r3)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.b.f(java.lang.Throwable, q2.i):void");
    }
}
