package B1;

import android.app.Notification;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f295b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f296c;

    public i(int i2, Notification notification, int i3) {
        this.f294a = i2;
        this.f296c = notification;
        this.f295b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f294a == iVar.f294a && this.f295b == iVar.f295b) {
            return this.f296c.equals(iVar.f296c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f296c.hashCode() + (((this.f294a * 31) + this.f295b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f294a + ", mForegroundServiceType=" + this.f295b + ", mNotification=" + this.f296c + '}';
    }
}
