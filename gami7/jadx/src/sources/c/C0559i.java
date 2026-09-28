package c;

import B1.C;
import J.C0285q;
import m2.C0880v;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559i extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f7174i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f7175j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7176k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7177l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0559i(boolean z3, y2.e eVar, int i2, int i3) {
        super(2);
        this.f7174i = z3;
        this.f7175j = eVar;
        this.f7176k = i2;
        this.f7177l = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f7176k | 1;
        C.e(this.f7174i, this.f7175j, (C0285q) obj, i2, this.f7177l);
        return C0880v.f8657a;
    }
}
