package c;

import D.S;
import J.InterfaceC0258c0;
import J.W0;
import J2.InterfaceC0328z;
import b.AbstractC0491o;
import b.C0478b;

/* renamed from: c.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560j extends AbstractC0491o {

    /* renamed from: d, reason: collision with root package name */
    public S f7178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f7179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W0 f7180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0560j(boolean z3, InterfaceC0328z interfaceC0328z, InterfaceC0258c0 interfaceC0258c0) {
        super(z3);
        this.f7179e = interfaceC0328z;
        this.f7180f = interfaceC0258c0;
    }

    @Override // b.AbstractC0491o
    public final void a() {
        S s3 = this.f7178d;
        if (s3 != null) {
            s3.d();
        }
    }

    @Override // b.AbstractC0491o
    public final void b() {
        S s3 = this.f7178d;
        if (s3 != null && !s3.f762b) {
            s3.d();
            this.f7178d = null;
        }
        if (this.f7178d == null) {
            this.f7178d = new S(this.f7179e, false, (y2.e) this.f7180f.getValue());
        }
        S s4 = this.f7178d;
        if (s4 != null) {
            ((L2.g) s4.f763c).p(null);
        }
    }

    @Override // b.AbstractC0491o
    public final void c(C0478b c0478b) {
        super.c(c0478b);
        S s3 = this.f7178d;
        if (s3 != null) {
            ((L2.g) s3.f763c).q(c0478b);
        }
    }

    @Override // b.AbstractC0491o
    public final void d(C0478b c0478b) {
        super.d(c0478b);
        S s3 = this.f7178d;
        if (s3 != null) {
            s3.d();
        }
        this.f7178d = new S(this.f7179e, true, (y2.e) this.f7180f.getValue());
    }
}
