package J2;

import q2.InterfaceC1076g;
import q2.InterfaceC1078i;

/* renamed from: J2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321s extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final C0321s f4426j = new C0321s(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0321s f4427k = new C0321s(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4428i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0321s(int i2, int i3) {
        super(i2);
        this.f4428i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f4428i) {
            case 0:
                return ((InterfaceC1078i) obj).A((InterfaceC1076g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC1078i) obj).A((InterfaceC1076g) obj2);
        }
    }
}
