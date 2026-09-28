package androidx.compose.foundation;

import J.C0285q;
import V.o;
import n.w0;
import p.U;
import p.X;
import y2.f;
import z2.i;

/* loaded from: classes.dex */
public final class e extends i implements f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0 f6585i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6586j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U f6587k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f6588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f6589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w0 w0Var, boolean z3, U u3, boolean z4, boolean z5) {
        super(3);
        this.f6585i = w0Var;
        this.f6586j = z3;
        this.f6587k = u3;
        this.f6588l = z4;
        this.f6589m = z5;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        c0285q.U(1478351300);
        w0 w0Var = this.f6585i;
        boolean z3 = this.f6586j;
        U u3 = this.f6587k;
        boolean z4 = this.f6588l;
        boolean z5 = this.f6589m;
        o k3 = K1.f.L(new ScrollSemanticsElement(w0Var, z3, u3, z4, z5), w0Var, z5 ? X.f9518h : X.f9519i, z4, z3, u3, w0Var.f8885c, c0285q).k(new ScrollingLayoutElement(this.f6585i, this.f6586j, this.f6589m));
        c0285q.r(false);
        return k3;
    }
}
