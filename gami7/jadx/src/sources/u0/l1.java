package u0;

import M2.InterfaceC0344h;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class l1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public L2.a f11101l;

    /* renamed from: m, reason: collision with root package name */
    public int f11102m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11103n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f11104o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Uri f11105p;
    public final /* synthetic */ m1 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L2.k f11106r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f11107s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ContentResolver contentResolver, Uri uri, m1 m1Var, L2.k kVar, Context context, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11104o = contentResolver;
        this.f11105p = uri;
        this.q = m1Var;
        this.f11106r = kVar;
        this.f11107s = context;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((l1) m((InterfaceC0344h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        l1 l1Var = new l1(this.f11104o, this.f11105p, this.q, this.f11106r, this.f11107s, interfaceC1073d);
        l1Var.f11103n = obj;
        return l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:9:0x0042, B:14:0x0052, B:16:0x005a, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r11) {
        /*
            r10 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r10.f11102m
            r2 = 2
            r3 = 1
            u0.m1 r4 = r10.q
            android.content.ContentResolver r5 = r10.f11104o
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            L2.a r1 = r10.f11101l
            java.lang.Object r6 = r10.f11103n
            M2.h r6 = (M2.InterfaceC0344h) r6
            C1.y.J(r11)     // Catch: java.lang.Throwable -> L1b
        L19:
            r11 = r6
            goto L42
        L1b:
            r11 = move-exception
            goto L83
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            L2.a r1 = r10.f11101l
            java.lang.Object r6 = r10.f11103n
            M2.h r6 = (M2.InterfaceC0344h) r6
            C1.y.J(r11)     // Catch: java.lang.Throwable -> L1b
            goto L52
        L2f:
            C1.y.J(r11)
            java.lang.Object r11 = r10.f11103n
            M2.h r11 = (M2.InterfaceC0344h) r11
            android.net.Uri r1 = r10.f11105p
            r6 = 0
            r5.registerContentObserver(r1, r6, r4)
            L2.k r1 = r10.f11106r     // Catch: java.lang.Throwable -> L1b
            L2.a r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L42:
            r10.f11103n = r11     // Catch: java.lang.Throwable -> L1b
            r10.f11101l = r1     // Catch: java.lang.Throwable -> L1b
            r10.f11102m = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r6 = r1.b(r10)     // Catch: java.lang.Throwable -> L1b
            if (r6 != r0) goto L4f
            return r0
        L4f:
            r9 = r6
            r6 = r11
            r11 = r9
        L52:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1b
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto L7d
            r1.c()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r11 = r10.f11107s     // Catch: java.lang.Throwable -> L1b
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1b
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1b
            r10.f11103n = r6     // Catch: java.lang.Throwable -> L1b
            r10.f11101l = r1     // Catch: java.lang.Throwable -> L1b
            r10.f11102m = r2     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r11 = r6.f(r7, r10)     // Catch: java.lang.Throwable -> L1b
            if (r11 != r0) goto L19
            return r0
        L7d:
            r5.unregisterContentObserver(r4)
            m2.v r11 = m2.C0880v.f8657a
            return r11
        L83:
            r5.unregisterContentObserver(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l1.p(java.lang.Object):java.lang.Object");
    }
}
