package u0;

import a0.C0438o;
import m2.C0880v;

/* renamed from: u0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1306q0 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11126i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11127j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f11128k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f11129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306q0(z.S s3, C0438o c0438o, boolean z3) {
        super(0);
        this.f11128k = s3;
        this.f11129l = c0438o;
        this.f11127j = z3;
    }

    @Override // y2.a
    public final Object c() {
        R0 r02;
        switch (this.f11126i) {
            case 0:
                if (this.f11127j) {
                    u1.e eVar = (u1.e) this.f11128k;
                    eVar.getClass();
                    String str = (String) this.f11129l;
                    z2.h.f(str, "key");
                    eVar.f11261a.b(str);
                }
                return C0880v.f8657a;
            default:
                boolean z3 = !this.f11127j;
                z.S s3 = (z.S) this.f11128k;
                if (!s3.b()) {
                    ((C0438o) this.f11129l).b();
                } else if (z3 && (r02 = s3.f11545c) != null) {
                    ((C1300n0) r02).b();
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306q0(boolean z3, u1.e eVar, String str) {
        super(0);
        this.f11127j = z3;
        this.f11128k = eVar;
        this.f11129l = str;
    }
}
