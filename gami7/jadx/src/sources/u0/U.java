package u0;

import J2.InterfaceC0328z;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class U implements InterfaceC0328z {

    /* renamed from: h, reason: collision with root package name */
    public final View f10977h;

    /* renamed from: i, reason: collision with root package name */
    public final I0.A f10978i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0328z f10979j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f10980k = new AtomicReference(null);

    public U(C1314v c1314v, I0.A a3, InterfaceC0328z interfaceC0328z) {
        this.f10977h = c1314v;
        this.f10978i = a3;
        this.f10979j = interfaceC0328z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(B.G r6, q2.InterfaceC1073d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u0.S
            if (r0 == 0) goto L13
            r0 = r7
            u0.S r0 = (u0.S) r0
            int r1 = r0.f10972m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10972m = r1
            goto L18
        L13:
            u0.S r0 = new u0.S
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f10970k
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f10972m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            C1.y.J(r7)
            goto L4f
        L2f:
            C1.y.J(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f10980k
            p.b r2 = new p.b
            r4 = 11
            r2.<init>(r6, r4, r5)
            u0.T r6 = new u0.T
            r4 = 0
            r6.<init>(r5, r4)
            r0.f10972m = r3
            V.r r3 = new V.r
            r3.<init>(r2, r7, r6, r4)
            java.lang.Object r6 = J2.B.e(r3, r0)
            if (r6 != r1) goto L4f
            return
        L4f:
            J2.r r6 = new J2.r
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.U.a(B.G, q2.d):void");
    }

    @Override // J2.InterfaceC0328z
    public final InterfaceC1078i r() {
        return this.f10979j.r();
    }
}
