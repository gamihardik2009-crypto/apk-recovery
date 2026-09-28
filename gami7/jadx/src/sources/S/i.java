package S;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class i extends z2.i implements y2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final i f5565j = new i(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f5566k = new i(0, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i2, int i3) {
        super(i2);
        this.f5567i = i3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f5567i) {
            case 0:
                return new h(new LinkedHashMap());
            default:
                return null;
        }
    }
}
