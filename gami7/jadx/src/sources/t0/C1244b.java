package t0;

import m2.C0880v;
import s0.InterfaceC1189c;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244b extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10555i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1245c f10556j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1244b(C1245c c1245c, int i2) {
        super(0);
        this.f10555i = i2;
        this.f10556j = c1245c;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f10555i) {
            case 0:
                this.f10556j.M0();
                break;
            default:
                C1245c c1245c = this.f10556j;
                V.m mVar = c1245c.f10557u;
                z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC1189c) mVar).i(c1245c);
                break;
        }
        return C0880v.f8657a;
    }
}
