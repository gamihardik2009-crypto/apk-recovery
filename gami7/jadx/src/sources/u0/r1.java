package u0;

import J.C0294v;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;
import com.example.bulksmsscheduler.R;
import p.C1007b;

/* loaded from: classes.dex */
public final class r1 implements J.r, androidx.lifecycle.r {

    /* renamed from: h, reason: collision with root package name */
    public final C1314v f11138h;

    /* renamed from: i, reason: collision with root package name */
    public final J.r f11139i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11140j;

    /* renamed from: k, reason: collision with root package name */
    public C0472v f11141k;

    /* renamed from: l, reason: collision with root package name */
    public y2.e f11142l = AbstractC1292j0.f11066a;

    public r1(C1314v c1314v, C0294v c0294v) {
        this.f11138h = c1314v;
        this.f11139i = c0294v;
    }

    @Override // J.r
    public final void a() {
        if (!this.f11140j) {
            this.f11140j = true;
            this.f11138h.getView().setTag(R.id.wrapped_composition_tag, null);
            C0472v c0472v = this.f11141k;
            if (c0472v != null) {
                c0472v.f(this);
            }
        }
        this.f11139i.a();
    }

    @Override // J.r
    public final void c(y2.e eVar) {
        this.f11138h.setOnViewTreeOwnersAvailable(new C1007b(this, 15, eVar));
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        if (enumC0465n == EnumC0465n.ON_DESTROY) {
            a();
        } else {
            if (enumC0465n != EnumC0465n.ON_CREATE || this.f11140j) {
                return;
            }
            c(this.f11142l);
        }
    }
}
