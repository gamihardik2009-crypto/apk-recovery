package u0;

import a0.AbstractC0427d;
import a0.C0425b;
import a0.C0442s;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1305q extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11124i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0425b f11125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1305q(C0425b c0425b, int i2) {
        super(1);
        this.f11124i = i2;
        this.f11125j = c0425b;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11124i) {
            case 0:
                Boolean C3 = AbstractC0427d.C((C0442s) obj, this.f11125j.f6453a);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : true);
            default:
                Boolean C4 = AbstractC0427d.C((C0442s) obj, this.f11125j.f6453a);
                return Boolean.valueOf(C4 != null ? C4.booleanValue() : true);
        }
    }
}
