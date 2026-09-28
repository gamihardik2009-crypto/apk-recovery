package m;

import J.C0257c;
import J.C0274k0;

/* loaded from: classes.dex */
public final class G extends G.s {

    /* renamed from: i, reason: collision with root package name */
    public final C0274k0 f8305i;

    /* renamed from: j, reason: collision with root package name */
    public final C0274k0 f8306j;

    public G(Object obj) {
        super(2);
        J.W w2 = J.W.f4109m;
        this.f8305i = C0257c.N(obj, w2);
        this.f8306j = C0257c.N(obj, w2);
    }

    @Override // G.s
    public final Object g() {
        return this.f8305i.getValue();
    }

    @Override // G.s
    public final Object h() {
        return this.f8306j.getValue();
    }

    @Override // G.s
    public final void j(Object obj) {
        this.f8305i.setValue(obj);
    }

    @Override // G.s
    public final void k(p0 p0Var) {
    }

    @Override // G.s
    public final void l() {
    }
}
