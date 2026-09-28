package c;

import java.util.UUID;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552b extends z2.i implements y2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final C0552b f7160j = new C0552b(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0552b f7161k = new C0552b(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0552b f7162l = new C0552b(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0552b(int i2, int i3) {
        super(i2);
        this.f7163i = i3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f7163i) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
