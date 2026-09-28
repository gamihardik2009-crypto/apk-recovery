package l;

import java.util.Map;
import m.AbstractC0831e;
import m.E0;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798g extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final C0798g f8210j = new C0798g(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0798g f8211k = new C0798g(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8212i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0798g(int i2, int i3) {
        super(i2);
        this.f8212i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f8212i) {
            case 0:
                long j3 = ((O0.j) obj).f5147a;
                long j4 = ((O0.j) obj2).f5147a;
                Map map = E0.f8301a;
                return AbstractC0831e.m(400.0f, new O0.j(l0.c.e(1, 1)), 1);
            default:
                EnumC0812v enumC0812v = (EnumC0812v) obj2;
                return Boolean.valueOf(((EnumC0812v) obj) == enumC0812v && enumC0812v == EnumC0812v.f8248j);
        }
    }
}
