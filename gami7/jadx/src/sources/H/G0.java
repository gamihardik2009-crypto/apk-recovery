package H;

import I.AbstractC0239d;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* loaded from: classes.dex */
public final class G0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f1498i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0 f1499j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f1500k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.f f1501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f1502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f1503n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(InterfaceC0576P interfaceC0576P, B0 b02, float f3, y2.f fVar, y2.e eVar, y2.e eVar2) {
        super(2);
        this.f1498i = interfaceC0576P;
        this.f1499j = b02;
        this.f1500k = f3;
        this.f1501l = fVar;
        this.f1502m = eVar;
        this.f1503n = eVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC0223x4.a(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.i(AbstractC0239d.f3639c), 0.0f, AbstractC0239d.f3638b, 1), this.f1498i, this.f1499j.f1315a, 0L, this.f1500k, 0.0f, null, R.b.b(c0285q, -1706202235, new F0((Object) this.f1501l, (Object) this.f1502m, (Object) this.f1503n, 0)), c0285q, 12582918, 104);
        }
        return C0880v.f8657a;
    }
}
