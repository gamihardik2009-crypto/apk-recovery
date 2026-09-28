package m;

import J.C0257c;
import J.C0274k0;
import J.W0;

/* renamed from: m.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841n implements W0 {

    /* renamed from: h, reason: collision with root package name */
    public final x0 f8533h;

    /* renamed from: i, reason: collision with root package name */
    public final C0274k0 f8534i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0845s f8535j;

    /* renamed from: k, reason: collision with root package name */
    public long f8536k;

    /* renamed from: l, reason: collision with root package name */
    public long f8537l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8538m;

    public /* synthetic */ C0841n(x0 x0Var, Object obj, AbstractC0845s abstractC0845s, int i2) {
        this(x0Var, obj, (i2 & 4) != 0 ? null : abstractC0845s, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object a() {
        return this.f8533h.f8601b.l(this.f8535j);
    }

    @Override // J.W0
    public final Object getValue() {
        return this.f8534i.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f8534i.getValue() + ", velocity=" + a() + ", isRunning=" + this.f8538m + ", lastFrameTimeNanos=" + this.f8536k + ", finishedTimeNanos=" + this.f8537l + ')';
    }

    public C0841n(x0 x0Var, Object obj, AbstractC0845s abstractC0845s, long j3, long j4, boolean z3) {
        AbstractC0845s abstractC0845s2;
        this.f8533h = x0Var;
        this.f8534i = C0257c.N(obj, J.W.f4109m);
        if (abstractC0845s != null) {
            abstractC0845s2 = AbstractC0831e.i(abstractC0845s);
        } else {
            abstractC0845s2 = (AbstractC0845s) x0Var.f8600a.l(obj);
            abstractC0845s2.d();
        }
        this.f8535j = abstractC0845s2;
        this.f8536k = j3;
        this.f8537l = j4;
        this.f8538m = z3;
    }
}
