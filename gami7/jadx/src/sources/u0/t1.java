package u0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f11152a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u0.r1 a(u0.AbstractC1273a r6, J.AbstractC0288s r7, R.a r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = u0.AbstractC1313u0.f11156a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            L2.g r0 = B2.a.c(r2, r1, r0)
            m2.l r2 = u0.Y.f11005t
            java.lang.Object r2 = r2.getValue()
            q2.i r2 = (q2.InterfaceC1078i) r2
            O2.e r2 = J2.B.a(r2)
            u0.t0 r4 = new u0.t0
            r4.<init>(r0, r3)
            r5 = 3
            J2.B.r(r2, r3, r1, r4, r5)
            n0.B r2 = new n0.B
            r4 = 14
            r2.<init>(r4, r0)
            java.lang.Object r0 = T.n.f5710b
            monitor-enter(r0)
            java.util.List r4 = T.n.f5716h     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = n2.AbstractC0961m.Q(r4, r2)     // Catch: java.lang.Throwable -> L3c
            T.n.f5716h = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            T.n.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof u0.C1314v
            if (r1 == 0) goto L50
            u0.v r0 = (u0.C1314v) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            u0.v r0 = new u0.v
            android.content.Context r1 = r6.getContext()
            q2.i r2 = r7.h()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = u0.t1.f11152a
            r6.addView(r1, r2)
        L6e:
            t0.r0 r6 = new t0.r0
            t0.E r1 = r0.getRoot()
            r6.<init>(r1)
            J.v r1 = new J.v
            r1.<init>(r7, r6)
            android.view.View r6 = r0.getView()
            r2 = 2131099736(0x7f060058, float:1.7811834E38)
            java.lang.Object r6 = r6.getTag(r2)
            boolean r4 = r6 instanceof u0.r1
            if (r4 == 0) goto L8e
            r3 = r6
            u0.r1 r3 = (u0.r1) r3
        L8e:
            if (r3 != 0) goto L9c
            u0.r1 r3 = new u0.r1
            r3.<init>(r0, r1)
            android.view.View r6 = r0.getView()
            r6.setTag(r2, r3)
        L9c:
            r3.c(r8)
            q2.i r6 = r0.getCoroutineContext()
            q2.i r8 = r7.h()
            boolean r6 = z2.h.a(r6, r8)
            if (r6 != 0) goto Lb4
            q2.i r6 = r7.h()
            r0.setCoroutineContext(r6)
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.t1.a(u0.a, J.s, R.a):u0.r1");
    }
}
