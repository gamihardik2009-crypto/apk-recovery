package D;

import m2.C0880v;

/* renamed from: D.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050t extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f894i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f895j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f896k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0050t(int i2, int i3, Object obj) {
        super(0);
        this.f894i = i3;
        this.f896k = obj;
        this.f895j = i2;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f894i) {
            case 0:
                return Integer.valueOf(((C0.H) ((C0046o) this.f896k).f875e).e(this.f895j));
            default:
                ((y2.c) this.f896k).l(Integer.valueOf(this.f895j));
                return C0880v.f8657a;
        }
    }
}
